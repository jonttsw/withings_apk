package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import com.withings.user.User;
import tb0.e1;
/* compiled from: UserAdapter.kt */
/* loaded from: classes5.dex */
public final class j extends u<Object, RecyclerView.z> {

    /* renamed from: a  reason: collision with root package name */
    private final a f58361a;

    /* compiled from: UserAdapter.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void G2(User user);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(UnknownMeasuresActivity callback) {
        super(new m.f());
        kotlin.jvm.internal.u.j(callback, "callback");
        this.f58361a = callback;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        if (getItem(i11) instanceof UserItemData) {
            return 1;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z holder, int i11) {
        kotlin.jvm.internal.u.j(holder, "holder");
        if (holder instanceof k) {
            Object item = getItem(i11);
            kotlin.jvm.internal.u.h(item, "null cannot be cast to non-null type com.withings.wiscale2.measure.accountmeasure.unknown.ui.UserItemData");
            ((k) holder).a((UserItemData) item, this.f58361a);
        } else if (holder instanceof jh0.b) {
            ((jh0.b) holder).a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        if (i11 == 1) {
            return new k(e1.b(LayoutInflater.from(parent.getContext()), parent));
        }
        return new jh0.b(e1.b(LayoutInflater.from(parent.getContext()), parent));
    }
}
