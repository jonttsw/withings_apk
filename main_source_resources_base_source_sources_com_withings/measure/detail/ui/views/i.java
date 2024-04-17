package com.withings.measure.detail.ui.views;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.wiscale2.C1987R;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ArticlesView.kt */
/* loaded from: classes4.dex */
public final class i extends u<LearnMoreEntryTranslations, h> {

    /* renamed from: a  reason: collision with root package name */
    private l<? super String, y> f41846a;

    public i() {
        super(new m.f());
    }

    public final void d(l<? super String, y> lVar) {
        this.f41846a = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z zVar, int i11) {
        h holder = (h) zVar;
        kotlin.jvm.internal.u.j(holder, "holder");
        LearnMoreEntryTranslations item = getItem(i11);
        kotlin.jvm.internal.u.i(item, "getItem(...)");
        holder.a(item, this.f41846a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new h(androidx.collection.c.n(parent, C1987R.layout.article_card_view));
    }
}
