package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import com.withings.wiscale2.C1987R;
/* compiled from: UnknownMeasureAdapter.kt */
/* loaded from: classes5.dex */
public final class a extends u<jh0.d, b> {

    /* renamed from: a  reason: collision with root package name */
    private final InterfaceC0754a f58341a;

    /* compiled from: UnknownMeasureAdapter.kt */
    /* renamed from: com.withings.wiscale2.measure.accountmeasure.unknown.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC0754a {
        void W(jh0.d dVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UnknownMeasuresActivity callback) {
        super(new m.f());
        kotlin.jvm.internal.u.j(callback, "callback");
        this.f58341a = callback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, int i11) {
        b holder = (b) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        jh0.d item = getItem(i11);
        kotlin.jvm.internal.u.h(item, "null cannot be cast to non-null type com.withings.wiscale2.measure.accountmeasure.unknown.ui.UnknownMeasure");
        holder.a(item, this.f58341a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(C1987R.layout.viewholder_unknown_measures, parent, false);
        kotlin.jvm.internal.u.i(inflate, "inflate(...)");
        return new b(inflate);
    }
}
