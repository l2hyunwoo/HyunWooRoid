package com.l2hyunwoo.android.presentation.signup

import android.os.Bundle
import androidx.activity.viewModels
import com.l2hyunwoo.android.R
import com.l2hyunwoo.android.base.BindingActivity
import com.l2hyunwoo.android.databinding.ActivitySignUpBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignUpActivity : BindingActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
    private val signUpViewModel: SignUpViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this
        binding.viewModel = signUpViewModel
    }
}
