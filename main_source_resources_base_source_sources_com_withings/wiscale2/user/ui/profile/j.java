package com.withings.wiscale2.user.ui.profile;

import androidx.compose.material.c5;
import com.withings.common.compose.component.bottomSheet.BottomSheetType;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileActivity.kt */
/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditProfileActivity f61967a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f61968b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BottomSheetType f61969c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c5 f61970d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ m70.l f61971e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f61972f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(EditProfileActivity editProfileActivity, CoroutineScope coroutineScope, BottomSheetType bottomSheetType, c5 c5Var, m70.l lVar, int i11) {
        super(2);
        this.f61967a = editProfileActivity;
        this.f61968b = coroutineScope;
        this.f61969c = bottomSheetType;
        this.f61970d = c5Var;
        this.f61971e = lVar;
        this.f61972f = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f61972f | 1);
        c5 c5Var = this.f61970d;
        m70.l lVar = this.f61971e;
        EditProfileActivity.F3(this.f61967a, this.f61968b, this.f61969c, c5Var, lVar, aVar, g11);
        return nm0.y.f85009a;
    }
}
