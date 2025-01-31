package com.lukianbat.test.pokeapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.lukianbat.test.pokeapp.databinding.ActivityPokemonBindingImpl;
import com.lukianbat.test.pokeapp.databinding.ActivityPokemonBindingLandImpl;
import com.lukianbat.test.pokeapp.databinding.ActivityPokemonListBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYPOKEMON = 1;

  private static final int LAYOUT_ACTIVITYPOKEMONLIST = 2;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.lukianbat.test.pokeapp.R.layout.activity_pokemon, LAYOUT_ACTIVITYPOKEMON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.lukianbat.test.pokeapp.R.layout.activity_pokemon_list, LAYOUT_ACTIVITYPOKEMONLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYPOKEMON: {
          if ("layout/activity_pokemon_0".equals(tag)) {
            return new ActivityPokemonBindingImpl(component, view);
          }
          if ("layout-land/activity_pokemon_0".equals(tag)) {
            return new ActivityPokemonBindingLandImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_pokemon is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPOKEMONLIST: {
          if ("layout/activity_pokemon_list_0".equals(tag)) {
            return new ActivityPokemonListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_pokemon_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "activity");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_pokemon_0", com.lukianbat.test.pokeapp.R.layout.activity_pokemon);
      sKeys.put("layout-land/activity_pokemon_0", com.lukianbat.test.pokeapp.R.layout.activity_pokemon);
      sKeys.put("layout/activity_pokemon_list_0", com.lukianbat.test.pokeapp.R.layout.activity_pokemon_list);
    }
  }
}
