package com.example.testingmenu;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class MenuDesplegableActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static int opcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_desplegable);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager adminFragment = getSupportFragmentManager();

        switch (opcion){
            case 1:
                adminFragment.beginTransaction().replace(R.id.lyt_content_menu, new Img1Fragment()).commit();
                break;
            case 2:
                adminFragment.beginTransaction().replace(R.id.lyt_content_menu, new Img2Fragment()).commit();
                break;
            case 3:
                adminFragment.beginTransaction().replace(R.id.lyt_content_menu, new Img3Fragment()).commit();
                break;
            case 4:
                adminFragment.beginTransaction().replace(R.id.lyt_content_menu, new Img4Fragment()).commit();
                break;
            default:
                adminFragment.beginTransaction().replace(R.id.lyt_content_menu, new Img1Fragment()).commit();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_desplegable, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        FragmentManager adminFragment = getSupportFragmentManager();

        if (id == R.id.nav_home) {
            adminFragment.beginTransaction().replace(R.id.lyt_content_menu, new Img1Fragment()).commit();
        } else if (id == R.id.nav_gallery) {
            adminFragment.beginTransaction().replace(R.id.lyt_content_menu, new Img2Fragment()).commit();
        } else if (id == R.id.nav_slideshow) {
            adminFragment.beginTransaction().replace(R.id.lyt_content_menu, new Img3Fragment()).commit();
        } else if (id == R.id.nav_tools) {
            adminFragment.beginTransaction().replace(R.id.lyt_content_menu, new Img4Fragment()).commit();
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
