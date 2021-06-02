import React from 'react'

const Tweet = ({tweet}) => {
    return (
        <div className ="task" >        
            <h3>{tweet.tweet} 
                {/* <FaTimes style ={{color: 'red', cursor: 'pointer'}} 
                onClick = {() =>onDelete(task.id)}/> */}
            </h3>
        </div>
    )
}

export default Tweet
