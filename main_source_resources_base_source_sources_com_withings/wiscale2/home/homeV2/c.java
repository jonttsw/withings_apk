package com.withings.wiscale2.home.homeV2;

import kotlin.jvm.internal.w;
import kotlinx.coroutines.flow.Flow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeViewModel.kt */
/* loaded from: classes5.dex */
public final class c extends w implements ym0.a<Flow<? extends Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HomeViewModel f57844a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HomeViewModel homeViewModel) {
        super(0);
        this.f57844a = homeViewModel;
    }

    @Override // ym0.a
    public final Flow<? extends Boolean> invoke() {
        return this.f57844a.f57796g.get();
    }
}
