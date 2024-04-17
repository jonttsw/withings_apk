package com.withings.wiscale2.profile;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.profile.ProfileUsersView;
import com.withings.wiscale2.user.ui.CreateUserActivity;
import com.withings.wiscale2.user.ui.profile.EditProfileActivity;
import java.util.List;
/* compiled from: ProfileUsersView.kt */
/* loaded from: classes5.dex */
public final class n1 extends RecyclerView.Adapter<RecyclerView.z> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f59414a;

    /* renamed from: b  reason: collision with root package name */
    private final List<User> f59415b;

    /* renamed from: c  reason: collision with root package name */
    private final ProfileUsersView.a f59416c;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(Context context, List<? extends User> userList, ProfileUsersView.a aVar) {
        kotlin.jvm.internal.u.j(userList, "userList");
        this.f59414a = context;
        this.f59415b = userList;
        this.f59416c = aVar;
    }

    public static void d(n1 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ProfileUsersView.a aVar = this$0.f59416c;
        if (aVar != null) {
            int i11 = CreateUserActivity.f61746t;
            aVar.J0(CreateUserActivity.a.a(this$0.f59414a, "profile"));
        }
    }

    public static void e(n1 this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ProfileUsersView.a aVar = this$0.f59416c;
        if (aVar != null) {
            EditProfileActivity.a aVar2 = EditProfileActivity.f61841i;
            long q11 = this$0.f59415b.get(i11).q();
            aVar2.getClass();
            aVar.J0(EditProfileActivity.a.a(this$0.f59414a, q11, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f59415b.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i11) {
        if (i11 != getItemCount() - 1) {
            return 1;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.z holder, int i11) {
        kotlin.jvm.internal.u.j(holder, "holder");
        if (holder instanceof m1) {
            ((m1) holder).a(this.f59415b.get(i11));
            holder.itemView.setOnClickListener(new wp.m(this, i11, 1));
        } else if (holder instanceof a) {
            holder.itemView.setOnClickListener(new androidx.viewpager.widget.c(this, 15));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.z onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        if (i11 == 2) {
            return new RecyclerView.z(androidx.collection.c.n(parent, C1987R.layout.cell_item_profile_add_user));
        }
        return new m1(androidx.collection.c.n(parent, C1987R.layout.cell_item_profile_user));
    }
}
