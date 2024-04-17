package com.withings.wiscale2.chat.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.leaderboard.repositories.data.LeaderboardEntry;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
/* loaded from: classes4.dex */
public final class f extends RecyclerView.Adapter<i> {

    /* renamed from: a  reason: collision with root package name */
    private LeaderboardEntry f50392a;

    /* renamed from: b  reason: collision with root package name */
    private LeaderboardEntry f50393b;

    /* renamed from: c  reason: collision with root package name */
    private List<? extends ob0.b> f50394c;

    /* renamed from: d  reason: collision with root package name */
    private final int f50395d;

    /* renamed from: e  reason: collision with root package name */
    private final int f50396e;

    public f(int i11) {
        ArrayList arrayList = new ArrayList();
        this.f50392a = null;
        this.f50393b = null;
        this.f50394c = arrayList;
        this.f50395d = 1;
        this.f50396e = 2;
    }

    public final List<ob0.b> d() {
        return this.f50394c;
    }

    public final void e(LeaderboardEntry leaderboardEntry, LeaderboardEntry leaderboardEntry2) {
        this.f50393b = leaderboardEntry;
        this.f50392a = leaderboardEntry2;
    }

    public final void f(List<? extends ob0.b> list) {
        this.f50394c = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f50394c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        switch (this.f50394c.get(i11).f()) {
            case 1:
            case 2:
            case 3:
            case 4:
                LeaderboardEntry leaderboardEntry = this.f50392a;
                if (leaderboardEntry != null && this.f50394c.get(i11).e() == leaderboardEntry.getUserid()) {
                    return 0;
                }
                return this.f50395d;
            case 5:
            case 6:
                return this.f50396e;
            default:
                int f11 = this.f50394c.get(i11).f();
                Fail.j("What is this message ? state = " + f11);
                return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(i iVar, int i11) {
        i holder = iVar;
        u.j(holder, "holder");
        holder.a(this.f50394c.get(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final i onCreateViewHolder(ViewGroup parent, int i11) {
        int i12;
        String str;
        u.j(parent, "parent");
        if (i11 == 0) {
            i12 = C1987R.layout.item_chat_message_user;
        } else if (i11 == this.f50395d) {
            i12 = C1987R.layout.item_chat_message_friend;
        } else if (i11 == this.f50396e) {
            i12 = C1987R.layout.item_chat_overtake;
        } else {
            i12 = 0;
        }
        View inflate = LayoutInflater.from(parent.getContext()).inflate(i12, parent, false);
        u.g(inflate);
        LeaderboardEntry leaderboardEntry = this.f50393b;
        if (leaderboardEntry != null) {
            str = leaderboardEntry.getFirstname();
        } else {
            str = null;
        }
        return new i(inflate, str);
    }
}
