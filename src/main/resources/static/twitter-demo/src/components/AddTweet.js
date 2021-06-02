import React from 'react'
import { useState } from 'react'

const AddTweet = ({onCreateTweet,userId,userName}) => {
    const [tweet, setTweet] = useState('')
    const onSubmit = (e)=>{
        e.preventDefault();
        if(!tweet){
            alert('Tweet must not be null')
            return
        }
        onCreateTweet({tweet,userId})
        setTweet('')
    }
    return (
        <form className = 'add-form' onSubmit = {onSubmit}>
            <div className = 'form-control'>
                <label>Task</label>
                <input type = 'text' placeholder='Tweet' 
                    value = {tweet} onChange= {(e)=>setTweet(e.target.value)}></input>
            </div>
            <input type= 'submit' value='Tweet' className='btn btn-block'></input>
        </form>
    )
}

export default AddTweet
