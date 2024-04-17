package com.withings.authentication.userCreation;

import androidx.lifecycle.h1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
/* compiled from: UserInfoNavigation.kt */
/* loaded from: classes3.dex */
final class j extends kotlin.jvm.internal.w implements ym0.l<Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f32575a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m70.k f32576b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ UserCreationViewModel f32577c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z5, m70.k kVar, UserCreationViewModel userCreationViewModel) {
        super(1);
        this.f32575a = z5;
        this.f32576b = kVar;
        this.f32577c = userCreationViewModel;
    }

    @Override // ym0.l
    public final y invoke(Integer num) {
        int intValue = num.intValue();
        boolean z5 = this.f32575a;
        m70.k kVar = this.f32576b;
        if (z5) {
            kVar.i(intValue);
        } else {
            kVar.k(intValue);
        }
        int c11 = kVar.c();
        int f11 = kVar.f();
        UserCreationViewModel userCreationViewModel = this.f32577c;
        userCreationViewModel.getClass();
        BuildersKt__Builders_commonKt.launch$default(h1.a(userCreationViewModel), Dispatchers.getIO(), null, new c(userCreationViewModel, c11, f11, null), 2, null);
        return y.f85009a;
    }
}
