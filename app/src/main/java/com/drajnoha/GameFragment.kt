package com.drajnoha

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.drajnoha.databinding.FragmentGameBinding

class GameFragment : Fragment() {
    private var _binding: FragmentGameBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: GameViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentGameBinding.inflate(layoutInflater, container, false)
        val view = binding.root

        viewModel = ViewModelProvider(this).get(GameViewModel::class.java)
        val args = GameFragmentArgs.fromBundle(requireArguments())

        viewModel.set_player1(args.player1)
        viewModel.set_player2(args.player2)
        viewModel.set_player3(args.player3)
        viewModel.set_player4(args.player4)

        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.player1TextView.text = viewModel.player1
        binding.player2TextView.text = viewModel.player2
        binding.player3TextView.text = viewModel.player3
        binding.player4TextView.text = viewModel.player4


        binding.startButton.setOnClickListener {
            viewModel.updateScore1(binding.ligretto1EditText.text.toString().toInt(),
                    binding.hand1EditText.text.toString().toInt())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}