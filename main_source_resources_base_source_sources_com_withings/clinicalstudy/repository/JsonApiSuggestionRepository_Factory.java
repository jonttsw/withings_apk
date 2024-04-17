package com.withings.clinicalstudy.repository;

import dagger.internal.b;
import javax.inject.Provider;
import oi.a;
/* loaded from: classes3.dex */
public final class JsonApiSuggestionRepository_Factory implements b<JsonApiSuggestionRepository> {
    private final Provider<a> getRemoteJsonSuggestionProvider;
    private final Provider<JsonClinicalStudySuggestionRepository> jsonClinicalStudySuggestionRepositoryProvider;

    public JsonApiSuggestionRepository_Factory(Provider<JsonClinicalStudySuggestionRepository> provider, Provider<a> provider2) {
        this.jsonClinicalStudySuggestionRepositoryProvider = provider;
        this.getRemoteJsonSuggestionProvider = provider2;
    }

    public static JsonApiSuggestionRepository_Factory create(Provider<JsonClinicalStudySuggestionRepository> provider, Provider<a> provider2) {
        return new JsonApiSuggestionRepository_Factory(provider, provider2);
    }

    public static JsonApiSuggestionRepository newInstance(JsonClinicalStudySuggestionRepository jsonClinicalStudySuggestionRepository, a aVar) {
        return new JsonApiSuggestionRepository(jsonClinicalStudySuggestionRepository, aVar);
    }

    @Override // javax.inject.Provider
    public JsonApiSuggestionRepository get() {
        return newInstance(this.jsonClinicalStudySuggestionRepositoryProvider.get(), this.getRemoteJsonSuggestionProvider.get());
    }
}
