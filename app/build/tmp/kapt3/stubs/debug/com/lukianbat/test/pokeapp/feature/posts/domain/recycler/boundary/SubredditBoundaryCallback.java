package com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001e\u0010\u001c\u001a\u00020\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0002H\u0017J\u0010\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0002H\u0016J\b\u0010#\u001a\u00020\nH\u0017R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/SubredditBoundaryCallback;", "Landroidx/paging/PagedList$BoundaryCallback;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/model/PokemonDto;", "limit", "", "webservice", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApiDataSource;", "handleResponse", "Lkotlin/Function1;", "Lcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/model/PokemonsListNetworkDto;", "", "ioExecutor", "Ljava/util/concurrent/Executor;", "(ILcom/lukianbat/test/pokeapp/feature/posts/data/datasource/api/PokemonListApiDataSource;Lkotlin/jvm/functions/Function1;Ljava/util/concurrent/Executor;)V", "currentPage", "helper", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/helper/PagingRequestHelper;", "getHelper", "()Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/helper/PagingRequestHelper;", "networkState", "Landroidx/lifecycle/LiveData;", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/boundary/NetworkState;", "getNetworkState", "()Landroidx/lifecycle/LiveData;", "createWebserviceCallback", "Lretrofit2/Callback;", "it", "Lcom/lukianbat/test/pokeapp/feature/posts/domain/recycler/helper/PagingRequestHelper$Request$Callback;", "insertItemsIntoDb", "response", "Lretrofit2/Response;", "onItemAtEndLoaded", "itemAtEnd", "onItemAtFrontLoaded", "itemAtFront", "onZeroItemsLoaded", "app_debug"})
public final class SubredditBoundaryCallback extends androidx.paging.PagedList.BoundaryCallback<com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto> {
    private int currentPage;
    @org.jetbrains.annotations.NotNull()
    private final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.helper.PagingRequestHelper helper = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> networkState = null;
    private int limit;
    private final com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSource webservice = null;
    private final kotlin.jvm.functions.Function1<com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonsListNetworkDto, kotlin.Unit> handleResponse = null;
    private final java.util.concurrent.Executor ioExecutor = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.lukianbat.test.pokeapp.feature.posts.domain.recycler.helper.PagingRequestHelper getHelper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.lukianbat.test.pokeapp.feature.posts.domain.recycler.boundary.NetworkState> getNetworkState() {
        return null;
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void onZeroItemsLoaded() {
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void onItemAtEndLoaded(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto itemAtEnd) {
    }
    
    private final void insertItemsIntoDb(retrofit2.Response<com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonsListNetworkDto> response, com.lukianbat.test.pokeapp.feature.posts.domain.recycler.helper.PagingRequestHelper.Request.Callback it) {
    }
    
    @java.lang.Override()
    public void onItemAtFrontLoaded(@org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.domain.model.PokemonDto itemAtFront) {
    }
    
    private final retrofit2.Callback<com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonsListNetworkDto> createWebserviceCallback(com.lukianbat.test.pokeapp.feature.posts.domain.recycler.helper.PagingRequestHelper.Request.Callback it) {
        return null;
    }
    
    public SubredditBoundaryCallback(int limit, @org.jetbrains.annotations.NotNull()
    com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.PokemonListApiDataSource webservice, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.lukianbat.test.pokeapp.feature.posts.data.datasource.api.model.PokemonsListNetworkDto, kotlin.Unit> handleResponse, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.Executor ioExecutor) {
        super();
    }
}