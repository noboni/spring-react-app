import UserLogin from './components/UserLogin'
import {useState } from 'react'
import {BrowserRouter as Router,Route} from 'react-router-dom'
import HomePage from './components/HomePage'

function App() {
  const [user , setUser] = useState({})
  //Add user
  const addOrLoginUser = async(user)=>{
    const res = await fetch('http://localhost:9091/user/login',
    {
      method : 'POST',
      headers : {
        'Content-type' : 'application/json'
      },
      body : JSON.stringify(user)
    })
    const data = await res.json()
    console.log(data)
    setUser(data)

  }
  return (
    <Router>
    <div className="container">
      <Route path="/" exact render={(props)=>(
          <>
            <UserLogin addOrLoginUser = {addOrLoginUser} />
          </>)
        }
      />
      <Route path="/:userName" exact 
        render={(props)=>(
          <>
            <HomePage user = {user} />
          </>)
        }
      />
      {/* <Route path="/about" component={About} /> */}
    </div>
  </Router>
    
  );
}

export default App;
