package com.withings.authentication.pickerUser;

import ah.o;
import com.withings.user.User;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PickerUser.kt */
/* loaded from: classes3.dex */
public final class f extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ User f32323a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f32324b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<User, y> f32325c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f32326d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(User user, boolean z5, l<? super User, y> lVar, int i11) {
        super(2);
        this.f32323a = user;
        this.f32324b = z5;
        this.f32325c = lVar;
        this.f32326d = i11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = o.g(this.f32326d | 1);
        boolean z5 = this.f32324b;
        l<User, y> lVar = this.f32325c;
        b.c(this.f32323a, z5, lVar, aVar, g11);
        return y.f85009a;
    }
}
