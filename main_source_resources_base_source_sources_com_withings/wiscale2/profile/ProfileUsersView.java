package com.withings.wiscale2.profile;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ProfileUsersView.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/withings/wiscale2/profile/ProfileUsersView;", "Landroid/widget/RelativeLayout;", "", "Lcom/withings/user/User;", "users", "Lnm0/y;", "setUsers", "(Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "a", "Lnm0/g;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/withings/wiscale2/profile/ProfileUsersView$a;", "c", "Lcom/withings/wiscale2/profile/ProfileUsersView$a;", "getDelegate", "()Lcom/withings/wiscale2/profile/ProfileUsersView$a;", "setDelegate", "(Lcom/withings/wiscale2/profile/ProfileUsersView$a;)V", "delegate", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProfileUsersView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f59275a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f59276b;

    /* renamed from: c  reason: collision with root package name */
    private a f59277c;

    /* compiled from: ProfileUsersView.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void J0(Intent intent);
    }

    /* compiled from: ProfileUsersView.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<RecyclerView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final RecyclerView invoke() {
            return (RecyclerView) ProfileUsersView.this.findViewById(C1987R.id.recycler_view_users);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileUsersView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    private final void a() {
        RecyclerView recyclerView = getRecyclerView();
        kotlin.jvm.internal.u.i(recyclerView, "<get-recyclerView>(...)");
        recyclerView.setVisibility(0);
        RecyclerView recyclerView2 = getRecyclerView();
        Context context = getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        recyclerView2.setAdapter(new n1(context, this.f59276b, this.f59277c));
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.f59275a.getValue();
    }

    public final a getDelegate() {
        return this.f59277c;
    }

    public final void setDelegate(a aVar) {
        this.f59277c = aVar;
    }

    public final void setUsers(List<? extends User> users) {
        kotlin.jvm.internal.u.j(users, "users");
        ArrayList arrayList = this.f59276b;
        arrayList.clear();
        arrayList.addAll(users);
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileUsersView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.u.j(context, "context");
        this.f59275a = nm0.h.b(new b());
        this.f59276b = new ArrayList();
        LayoutInflater.from(getContext()).inflate(C1987R.layout.profile_users_view, this);
        RecyclerView recyclerView = getRecyclerView();
        getRecyclerView().getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        getRecyclerView().setHasFixedSize(false);
        a();
    }
}
