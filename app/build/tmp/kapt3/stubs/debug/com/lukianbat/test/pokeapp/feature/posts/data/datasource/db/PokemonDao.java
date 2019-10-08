package com.lukianbat.test.pokeapp.feature.posts.data.datasource.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\bH\'\u00a8\u0006\n"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/db/PokemonDao;", "", "delete", "", "insert", "posts", "", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "Landroidx/paging/DataSource$Factory;", "", "app_debug"})
public abstract interface PokemonDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> posts);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM pokemons ORDER BY attack ASC")
    public abstract androidx.paging.DataSource.Factory<java.lang.Integer, com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> posts();
    
    @androidx.room.Query(value = "DELETE FROM pokemons")
    public abstract void delete();
}