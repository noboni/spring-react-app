import React from 'react'
import { useEffect,useState } from 'react'
import AddTweet from './AddTweet'
import Tweets from './Tweets'

const HomePage = ({user}) => {
    const [tweets, setTweets] = useState([])

    useEffect(()=>{
        const getTweets = async()=>{
          const tweetFromServer = await fetchTweets(user)
          setTweets(tweetFromServer)
        }
        getTweets()
      },[])
      // fetch  all data
    const fetchTweets = async(user)=>{
        console.log(user);
        const res = await fetch(`http://localhost:9091/tweet/user/${user.id}`)
        const data = res.json()
        console.log(data)
        return data;
    }

    const addTweet = async(tweet)=>{
        const res = await fetch('http://localhost:9091/tweet',
        {
          method : 'POST',
          headers : {
            'Content-type' : 'application/json'
          },
          body : JSON.stringify(tweet)
        })
        const data = await res.json()
        console.log(data)
        setTweets([...tweets,data])
    
      }

    return (
        <>
            <AddTweet onCreateTweet = {addTweet} userId = {user.id} userName ={user.userName}/>
            {tweets.length>0?
                <Tweets tweets =  {tweets} /> : 'No tweets to show'

            }
        </>
    )
}

export default HomePage
