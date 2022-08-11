package com.wahyurhy.mysimplecleanarchitecture.data

import com.wahyurhy.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}