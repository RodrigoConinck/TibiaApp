package com.example.tibiaapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tibiaapp.model.guild.Guild;
import com.example.tibiaapp.model.guild.Member;

import java.util.List;

public class InfoGuild extends AppCompatActivity {
    private TextView gName;
    private TextView gDescription;
    private TextView gFoundation;
    private TextView gMemberQty;
    private TextView gWorld;
    private List<Member> members;
    private ListView gMembersList;

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
        gMembersList = (ListView) findViewById(R.id.members_list);


        Guild data = (Guild) intent.getSerializableExtra(GuildQuery.EXTRA_TIBIA);
        gName.setText(data.getName());
        gDescription.setText(data.getDescription());
        gWorld.setText(data.getWorld());
        gFoundation.setText(data.getFounded());
        gMemberQty.setText(String.valueOf(data.getMembersTotal()));

        ListView listView = (ListView) findViewById(R.id.members_list);

        Member member = new Member();
        for (Member member1 : data.getMembers()) {
            System.out.println(member1.getName());

        }



    }


    public void finishActivity(View view) {
        this.finish();
    }
}