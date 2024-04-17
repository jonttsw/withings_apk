package com.withings.contentfavorite.viewmodel;

import androidx.lifecycle.g1;
import bx.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import vk.a;
/* compiled from: ContentFavoriteViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/contentfavorite/viewmodel/ContentFavoriteViewModel;", "Landroidx/lifecycle/g1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ContentFavoriteViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final a f35286a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableStateFlow<vk.a> f35287b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow f35288c;

    @Inject
    public ContentFavoriteViewModel(a sharedLiveWorkoutInfo) {
        u.j(sharedLiveWorkoutInfo, "sharedLiveWorkoutInfo");
        this.f35286a = sharedLiveWorkoutInfo;
        MutableStateFlow<vk.a> MutableStateFlow = StateFlowKt.MutableStateFlow(a.b.f103949a);
        this.f35287b = MutableStateFlow;
        this.f35288c = MutableStateFlow;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f35286a.e(false);
        super.onCleared();
    }
}
