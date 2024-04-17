package com.withings.ecg.details;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: EcgInReviewFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/ecg/details/a1;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class a1 extends q2 {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f38089i = 0;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public ch.d f38090h;

    /* compiled from: EcgInReviewFragment.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 2068781575, new z0(a1.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        Context context = inflater.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        composeView.setContent(new s1.a(true, -155646367, new a()));
        return composeView;
    }
}
