import React from 'react'
import {useState } from 'react'
import { useHistory } from "react-router-dom";

const UserLogin = ({addOrLoginUser}) => {
    const [userName, setUserName] = useState('')
    let history = useHistory();
    const onSubmit = (e)=>{
        e.preventDefault();
        if(!userName){
            alert('User name must not be null')
            return
        }
        addOrLoginUser({userName})
        setUserName('')
        history.push(`/${userName}`);
    }
    return (
        <form className = 'add-form' onSubmit = {onSubmit}>
            <div className = 'form-control'>
                <label>Task</label>
                <input type = 'text' placeholder='User name' 
                    value = {userName} onChange= {(e)=>setUserName(e.target.value)}></input>
            </div>
            <input type= 'submit' value='Login' className='btn btn-block'></input>
        </form>
    )
}

export default UserLogin

