package com.example.wallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvWallets.layoutManager = LinearLayoutManager(this)
        displayWallet()

    }
    fun displayWallet(){
        val wallet1 = Wallet("Salary","KES 400000","","1 July 2024")
        val wallet2 = Wallet("Rent","KES 16000","","2 July 2024")
        val wallet3 = Wallet("Dividends","KES 2400","","4 July 2024")
        val wallet4 = Wallet("Electricity","KES 800","","5 July 2024")
        val wallet5 = Wallet("Internet","KES 2500","","5 July 2024")
        val wallet6 = Wallet("Shopping","KES 3500","","5 July 2024")
        val wallet7 = Wallet("Bus fare","KES 500","","5 July 2024")
        val wallet8 = Wallet("Water bill","KES 3500","","11 July 2024")
        val myWallet = listOf(wallet1,wallet2,wallet3,wallet4,wallet5,wallet6,wallet7,wallet8)

        val moneyWalletAdapter = MoneyWalletAdapter(myWallet)
        binding.rvWallets.adapter = moneyWalletAdapter

    }
}