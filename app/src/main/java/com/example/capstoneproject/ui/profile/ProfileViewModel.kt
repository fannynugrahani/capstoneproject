package com.example.capstoneproject.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {

    private val _textName = MutableLiveData<String>().apply {
        value = "Fanny"
    }

    private val _textEmail = MutableLiveData<String>().apply {
        value = "fanny@gmail.com"
    }
    val textName: LiveData<String> = _textName
    val textEmail: LiveData<String> = _textEmail
}