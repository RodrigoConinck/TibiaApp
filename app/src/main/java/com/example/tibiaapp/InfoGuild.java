package com.example.tibiaapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tibiaapp.model.guild.Guild;
import com.example.tibiaapp.model.guild.Member;

import java.util.List;

public class InfoGuild extends AppCompatActivity{
    private TextView gName;
    private TextView gDescription;
    private TextView gFoundation;
    private TextView gMemberQty;
    private TextView gWorld;

    Context context;
    List<Member> members;

    public void setMembers(List<Member> members){
        this.members = members;
    }

    public InfoGuild(Context context, List<Member> members){
        this.context = context;
        this.members = members;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_guild);

        Intent intent = getIntent();

        gName = findViewById(R.id.guild_name);
        gDescription = findViewById(R.id.guild_description);
        gFoundation = findViewById(R.id.guild_foundation);
        gMemberQty = findViewById(R.id.guild_members);
        gWorld = findViewById(R.id.guild_world);


        Guild data = (Guild) intent.getSerializableExtra(GuildQuery.EXTRA_TIBIA);
        gName.setText(data.getName());
        gDescription.setText(data.getDescription());
        gWorld.setText(data.getWorld());
        gFoundation.setText(data.getFounded());
        gMemberQty.setText(String.valueOf(data.getMembersTotal()));

        Member member = new Member();
        for (Member member1 : data.getMembers()) {
            System.out.println(member1.getName());
        }

    }


    public void finishActivity(View view) {
        this.finish();
    }

    @NonNull
    public InfoGuild.MembersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.activity_info_guild, parent, false);
        return new MembersViewHolder(view);
    }

    public void onBindViewHolder(@NonNull InfoGuild.MembersViewHolder holder, int position){
        Member member = members.get(position);
        holder.memberName.setText(member.getName());
        holder.memberStatus.setText(member.getStatus());
        holder.memberVoc.setText(member.getVocation());
        holder.memberLevel.setText(member.getLevel());
    }



    public class MembersViewHolder extends RecyclerView.ViewHolder{
        TextView memberName;
        TextView memberLevel;
        TextView memberVoc;
        TextView memberStatus;

        public MembersViewHolder(@NonNull View itemView) {
            super(itemView);
            memberName = itemView.findViewById(R.id.member_name);
            memberLevel = itemView.findViewById(R.id.member_level);
            memberVoc = itemView.findViewById(R.id.member_voc);
            memberStatus = itemView.findViewById(R.id.member_status);
        }
    }
}