package com.example.wallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MoneyWalletAdapter(var monetery:List<Wallet>):
RecyclerView.Adapter<ContacsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContacsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.monetery, parent,false)
        return ContacsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContacsViewHolder, position: Int) {
        val wallet = monetery[position]
        holder.rvSalary.text = wallet.name
        holder.rvValue1.text = wallet.price
        holder.rvJuly.text = wallet.date
    }

    override fun getItemCount(): Int {
        return monetery.size
    }
}
class ContacsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var rvSalary = itemView.findViewById<TextView>(R.id.rvSalary)
    var rvValue1 =itemView.findViewById<TextView>(R.id.rvValue1)
    var rvJuly = itemView.findViewById<TextView>(R.id.rvJuly)
}