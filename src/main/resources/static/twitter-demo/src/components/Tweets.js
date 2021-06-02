import React from 'react'
import Tweet from './Tweet'

const Tweets = ({tweets}) => {
    return (
        <>
        {tweets.map((tweet,index) =>
            <Tweet key = {index} tweet = {tweet} />
        )}
    </>
           
    )
}

export default Tweets
