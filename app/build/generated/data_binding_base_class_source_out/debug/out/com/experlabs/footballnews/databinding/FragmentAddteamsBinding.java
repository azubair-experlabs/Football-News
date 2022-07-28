// Generated by view binder compiler. Do not edit!
package com.experlabs.footballnews.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.experlabs.footballnews.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddteamsBinding implements ViewBinding {
  @NonNull
  private final SwipeRefreshLayout rootView;

  @NonNull
  public final Spinner addPlayerSpinner;

  @NonNull
  public final Spinner addTeamCountrySpinner;

  @NonNull
  public final EditText addTeamDescriptionTextbox;

  @NonNull
  public final EditText addTeamnameTextbox;

  @NonNull
  public final EditText addflagUrlTextbox;

  @NonNull
  public final Button addteamBt;

  @NonNull
  public final EditText addteamPointsTextbox;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final RecyclerView playersRecycler;

  @NonNull
  public final SwipeRefreshLayout refreshAddPlayerBt;

  private FragmentAddteamsBinding(@NonNull SwipeRefreshLayout rootView,
      @NonNull Spinner addPlayerSpinner, @NonNull Spinner addTeamCountrySpinner,
      @NonNull EditText addTeamDescriptionTextbox, @NonNull EditText addTeamnameTextbox,
      @NonNull EditText addflagUrlTextbox, @NonNull Button addteamBt,
      @NonNull EditText addteamPointsTextbox, @NonNull LinearLayout linearLayout,
      @NonNull RecyclerView playersRecycler, @NonNull SwipeRefreshLayout refreshAddPlayerBt) {
    this.rootView = rootView;
    this.addPlayerSpinner = addPlayerSpinner;
    this.addTeamCountrySpinner = addTeamCountrySpinner;
    this.addTeamDescriptionTextbox = addTeamDescriptionTextbox;
    this.addTeamnameTextbox = addTeamnameTextbox;
    this.addflagUrlTextbox = addflagUrlTextbox;
    this.addteamBt = addteamBt;
    this.addteamPointsTextbox = addteamPointsTextbox;
    this.linearLayout = linearLayout;
    this.playersRecycler = playersRecycler;
    this.refreshAddPlayerBt = refreshAddPlayerBt;
  }

  @Override
  @NonNull
  public SwipeRefreshLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddteamsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddteamsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_addteams, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddteamsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addPlayer_spinner;
      Spinner addPlayerSpinner = ViewBindings.findChildViewById(rootView, id);
      if (addPlayerSpinner == null) {
        break missingId;
      }

      id = R.id.addTeamCountry_spinner;
      Spinner addTeamCountrySpinner = ViewBindings.findChildViewById(rootView, id);
      if (addTeamCountrySpinner == null) {
        break missingId;
      }

      id = R.id.addTeamDescription_textbox;
      EditText addTeamDescriptionTextbox = ViewBindings.findChildViewById(rootView, id);
      if (addTeamDescriptionTextbox == null) {
        break missingId;
      }

      id = R.id.addTeamname_textbox;
      EditText addTeamnameTextbox = ViewBindings.findChildViewById(rootView, id);
      if (addTeamnameTextbox == null) {
        break missingId;
      }

      id = R.id.addflagUrl_textbox;
      EditText addflagUrlTextbox = ViewBindings.findChildViewById(rootView, id);
      if (addflagUrlTextbox == null) {
        break missingId;
      }

      id = R.id.addteam_bt;
      Button addteamBt = ViewBindings.findChildViewById(rootView, id);
      if (addteamBt == null) {
        break missingId;
      }

      id = R.id.addteamPoints_textbox;
      EditText addteamPointsTextbox = ViewBindings.findChildViewById(rootView, id);
      if (addteamPointsTextbox == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.players_recycler;
      RecyclerView playersRecycler = ViewBindings.findChildViewById(rootView, id);
      if (playersRecycler == null) {
        break missingId;
      }

      SwipeRefreshLayout refreshAddPlayerBt = (SwipeRefreshLayout) rootView;

      return new FragmentAddteamsBinding((SwipeRefreshLayout) rootView, addPlayerSpinner,
          addTeamCountrySpinner, addTeamDescriptionTextbox, addTeamnameTextbox, addflagUrlTextbox,
          addteamBt, addteamPointsTextbox, linearLayout, playersRecycler, refreshAddPlayerBt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
