package com.withings.wiscale2.device.wpm.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.common.compose.component.AvatarSize;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: PickExistingUserFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/wpm/ui/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class c extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f55700c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f55701d;

    /* renamed from: e  reason: collision with root package name */
    private d f55702e;

    /* compiled from: PickExistingUserFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a extends RecyclerView.Adapter<e> {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return c.this.f55701d.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(e eVar, int i11) {
            e holder = eVar;
            kotlin.jvm.internal.u.j(holder, "holder");
            c cVar = c.this;
            d dVar = cVar.f55702e;
            if (dVar != null) {
                if (i11 == cVar.f55701d.size()) {
                    holder.b().setText(cVar.getString(C1987R.string._BPV2_GUEST_));
                    ComposeView a11 = holder.a();
                    kotlin.jvm.internal.u.i(a11, "<get-imageView>(...)");
                    com.withings.common.compose.component.c.f(a11, "?", "?", "", AvatarSize.f33299d, null, null, false, null, ConstantsWs.WS_STATUS_WRONGTZNAME);
                    holder.itemView.setOnClickListener(new androidx.viewpager.widget.c(dVar, 13));
                    return;
                }
                User user = (User) cVar.f55701d.get(i11);
                ComposeView a12 = holder.a();
                kotlin.jvm.internal.u.i(a12, "<get-imageView>(...)");
                String l5 = user.l();
                kotlin.jvm.internal.u.i(l5, "getFirstName(...)");
                String s11 = user.s();
                kotlin.jvm.internal.u.i(s11, "getLastName(...)");
                com.withings.common.compose.component.c.f(a12, l5, s11, user.a(), AvatarSize.f33299d, null, null, false, null, ConstantsWs.WS_STATUS_WRONGTZNAME);
                holder.b().setText(user.l());
                holder.itemView.setOnClickListener(new uc0.d(2, dVar, user));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final e onCreateViewHolder(ViewGroup parent, int i11) {
            kotlin.jvm.internal.u.j(parent, "parent");
            return new e(androidx.collection.c.n(parent, C1987R.layout.list_item_user));
        }
    }

    /* compiled from: PickExistingUserFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpm.ui.PickExistingUserFragment$onViewCreated$1$2", f = "PickExistingUserFragment.kt", l = {86}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f55704a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ RecyclerView f55706c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PickExistingUserFragment.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpm.ui.PickExistingUserFragment$onViewCreated$1$2$accountUsers$1", f = "PickExistingUserFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<User>>, Object> {
            a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new kotlin.coroutines.jvm.internal.i(2, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<User>> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                return m70.i.b().c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(RecyclerView recyclerView, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f55706c = recyclerView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f55706c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f55704a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                ?? iVar = new kotlin.coroutines.jvm.internal.i(2, null);
                this.f55704a = 1;
                obj = BuildersKt.withContext(io2, iVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            kotlin.jvm.internal.u.i(obj, "withContext(...)");
            c cVar = c.this;
            cVar.f55701d.clear();
            cVar.f55701d.addAll((List) obj);
            RecyclerView.Adapter adapter = this.f55706c.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: PickExistingUserFragment.kt */
    /* renamed from: com.withings.wiscale2.device.wpm.ui.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static final class C0733c extends kotlin.jvm.internal.w implements ym0.a<RecyclerView> {
        C0733c() {
            super(0);
        }

        @Override // ym0.a
        public final RecyclerView invoke() {
            View view = c.this.getView();
            if (view != null) {
                return (RecyclerView) view.findViewById(C1987R.id.user_list);
            }
            return null;
        }
    }

    public c() {
        super(C1987R.layout.fragment_wpm02_pick_user);
        this.f55700c = nm0.h.b(new C0733c());
        this.f55701d = new ArrayList();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f55702e = (d) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f55702e = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        vh.h.k(this);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) this.f55700c.getValue();
        if (recyclerView != null) {
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(new a());
            k80.a aVar = new k80.a(recyclerView.getContext());
            aVar.i(recyclerView.getResources().getDimensionPixelSize(C1987R.dimen.keyline_2));
            recyclerView.j(aVar);
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new b(recyclerView, null), 2, null);
        }
    }
}
