package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quizapp.databinding.FragmentWelcomeBinding

class Welcome : Fragment() {

    private lateinit var welcomeFragmentBinding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        welcomeFragmentBinding =  FragmentWelcomeBinding.inflate(inflater, container, false)
        val startGameButton = welcomeFragmentBinding.startBtn
        startGameButton.setOnClickListener {
            val navController = findNavController()
            val action = WelcomeDirections.actionWelcomeToQuiz(
                name = welcomeFragmentBinding.nameSpace.text.toString()
            )
            navController.navigate(action)
        }
        return welcomeFragmentBinding.root
    }

}