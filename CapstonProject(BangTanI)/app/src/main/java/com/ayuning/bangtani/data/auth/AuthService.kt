package com.ayuning.bangtani.data.auth

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("register")
    suspend fun registerUser(
        @Body authBody: AuthBody
    ): Response<AuthResponse>

    @POST("login")
    suspend fun loginUser(
        @Body loginBody: AuthLoginBody
    ): AuthResponse
}