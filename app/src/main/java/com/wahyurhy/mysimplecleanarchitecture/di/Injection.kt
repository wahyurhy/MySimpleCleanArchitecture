package com.wahyurhy.mysimplecleanarchitecture.di

import com.wahyurhy.mysimplecleanarchitecture.data.IMessageDataSource
import com.wahyurhy.mysimplecleanarchitecture.data.MessageDataSource
import com.wahyurhy.mysimplecleanarchitecture.data.MessageRepository
import com.wahyurhy.mysimplecleanarchitecture.domain.IMessageRepository
import com.wahyurhy.mysimplecleanarchitecture.domain.MessageInteractor
import com.wahyurhy.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}