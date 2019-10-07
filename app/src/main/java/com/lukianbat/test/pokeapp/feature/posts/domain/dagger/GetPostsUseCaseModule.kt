package com.lukianbat.test.pokeapp.feature.posts.domain.dagger

import com.lukianbat.test.pokeapp.feature.posts.data.repository.PokemonsRepository
import com.lukianbat.test.pokeapp.feature.posts.data.repository.dagger.PokemonsRepositoryModule
import com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonListUseCase
import com.lukianbat.test.pokeapp.feature.posts.domain.usecase.GetPokemonListUseCaseImpl
import dagger.Module
import dagger.Provides

@Module(includes = [PokemonsRepositoryModule::class])
class GetPostsUseCaseModule {

    @Provides
    fun bindsGetPostsUseCase(repository: PokemonsRepository): GetPokemonListUseCase =
        GetPokemonListUseCaseImpl(repository)
}