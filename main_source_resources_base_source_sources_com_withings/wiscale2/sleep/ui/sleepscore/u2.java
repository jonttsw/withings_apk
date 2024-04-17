package com.withings.wiscale2.sleep.ui.sleepscore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.user.core.models.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
/* compiled from: SleepNapListActivity.kt */
/* loaded from: classes5.dex */
public final class u2 extends RecyclerView.Adapter<w2> {

    /* renamed from: a  reason: collision with root package name */
    private final List<Track> f61529a;

    /* renamed from: b  reason: collision with root package name */
    private pm.e f61530b;

    /* renamed from: c  reason: collision with root package name */
    private User f61531c;

    public u2(List<Track> napsData, pm.e durationFormatter, User user) {
        kotlin.jvm.internal.u.j(napsData, "napsData");
        kotlin.jvm.internal.u.j(durationFormatter, "durationFormatter");
        kotlin.jvm.internal.u.j(user, "user");
        this.f61529a = napsData;
        this.f61530b = durationFormatter;
        this.f61531c = user;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f61529a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(w2 w2Var, int i11) {
        w2 holder = w2Var;
        kotlin.jvm.internal.u.j(holder, "holder");
        holder.b(this.f61529a.get(i11), this.f61530b, this.f61531c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final w2 onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(C1987R.layout.view_sleep_nap, parent, false);
        kotlin.jvm.internal.u.i(inflate, "inflate(...)");
        return new w2(inflate);
    }
}
