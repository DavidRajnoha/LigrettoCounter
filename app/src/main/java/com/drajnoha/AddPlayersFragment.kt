package com.drajnoha

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.drajnoha.databinding.FragmentAddPlayersBinding

class AddPlayersFragment : Fragment(){
    private var _binding: FragmentAddPlayersBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentAddPlayersBinding.inflate(layoutInflater, container, false)
        val view = binding.root

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.startButton.setOnClickListener { _view: View ->
            _view.findNavController().navigate(AddPlayersFragmentDirections.actionAddPlayersFragmentToGameFragment(
                    binding.player1EditText.text.toString(),
                    binding.player2EditText.text.toString(),
                    binding.player3EditText.text.toString(),
                    binding.player4EditText.text.toString()
            ))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}