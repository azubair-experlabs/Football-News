// Generated by view binder compiler. Do not edit!
package com.experlabs.footballnews.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.experlabs.footballnews.R;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentTeamsBinding implements ViewBinding {
  @NonNull
  private final SwipeRefreshLayout rootView;

  @NonNull
  public final SwipeRefreshLayout refreshTeamsBt;

  @NonNull
  public final TextInputLayout searchLayout;

  @NonNull
  public final RecyclerView teamsRecycler;

  private FragmentTeamsBinding(@NonNull SwipeRefreshLayout rootView,
      @NonNull SwipeRefreshLayout refreshTeamsBt, @NonNull TextInputLayout searchLayout,
      @NonNull RecyclerView teamsRecycler) {
    this.rootView = rootView;
    this.refreshTeamsBt = refreshTeamsBt;
    this.searchLayout = searchLayout;
    this.teamsRecycler = teamsRecycler;
  }

  @Override
  @NonNull
  public SwipeRefreshLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTeamsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTeamsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_teams, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTeamsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      SwipeRefreshLayout refreshTeamsBt = (SwipeRefreshLayout) rootView;

      id = R.id.search_layout;
      TextInputLayout searchLayout = ViewBindings.findChildViewById(rootView, id);
      if (searchLayout == null) {
        break missingId;
      }

      id = R.id.teams_recycler;
      RecyclerView teamsRecycler = ViewBindings.findChildViewById(rootView, id);
      if (teamsRecycler == null) {
        break missingId;
      }

      return new FragmentTeamsBinding((SwipeRefreshLayout) rootView, refreshTeamsBt, searchLayout,
          teamsRecycler);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
