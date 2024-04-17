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
/* compiled from: ProfileTargetView.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/withings/wiscale2/profile/ProfileTargetView;", "Landroid/widget/RelativeLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "kotlin.jvm.PlatformType", "a", "Lnm0/g;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Lcom/withings/wiscale2/profile/ProfileTargetView$a;", "d", "Lcom/withings/wiscale2/profile/ProfileTargetView$a;", "getDelegate", "()Lcom/withings/wiscale2/profile/ProfileTargetView$a;", "setDelegate", "(Lcom/withings/wiscale2/profile/ProfileTargetView$a;)V", "delegate", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProfileTargetView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f59270a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList f59271b;

    /* renamed from: c  reason: collision with root package name */
    private User f59272c;

    /* renamed from: d  reason: collision with root package name */
    private a f59273d;

    /* compiled from: ProfileTargetView.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void a0(Intent intent);
    }

    /* compiled from: ProfileTargetView.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<RecyclerView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final RecyclerView invoke() {
            return (RecyclerView) ProfileTargetView.this.findViewById(C1987R.id.recycler_view_targets);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileTargetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.f59270a.getValue();
    }

    public final void c(User user, List<d1> targetContainers) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(targetContainers, "targetContainers");
        this.f59272c = user;
        ArrayList arrayList = this.f59271b;
        arrayList.clear();
        arrayList.addAll(targetContainers);
        RecyclerView recyclerView = getRecyclerView();
        kotlin.jvm.internal.u.i(recyclerView, "<get-recyclerView>(...)");
        recyclerView.setVisibility(0);
        getRecyclerView().setAdapter(new x0(this));
    }

    public final a getDelegate() {
        return this.f59273d;
    }

    public final void setDelegate(a aVar) {
        this.f59273d = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileTargetView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.u.j(context, "context");
        this.f59270a = nm0.h.b(new b());
        ArrayList arrayList = new ArrayList();
        this.f59271b = arrayList;
        LayoutInflater.from(getContext()).inflate(C1987R.layout.profile_target_view, this);
        RecyclerView recyclerView = getRecyclerView();
        getRecyclerView().getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        getRecyclerView().setHasFixedSize(false);
        if (!arrayList.isEmpty()) {
            RecyclerView recyclerView2 = getRecyclerView();
            kotlin.jvm.internal.u.i(recyclerView2, "<get-recyclerView>(...)");
            recyclerView2.setVisibility(0);
            getRecyclerView().setAdapter(new x0(this));
        }
    }
}
