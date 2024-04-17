package com.withings.core.device;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import androidx.media3.datasource.d;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.source.y;
import androidx.media3.exoplayer.z0;
import androidx.media3.ui.PlayerView;
import com.google.android.material.button.MaterialButton;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import fn0.k;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import m0.t;
import m6.o;
import m6.x;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: FullscreenVideoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/core/device/FullscreenVideoFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FullscreenVideoFragment extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private Job f35331c;

    /* renamed from: d  reason: collision with root package name */
    private a f35332d;

    /* renamed from: e  reason: collision with root package name */
    private z0 f35333e;

    /* renamed from: f  reason: collision with root package name */
    private fm.b f35334f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f35335g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f35336h;

    /* renamed from: i  reason: collision with root package name */
    private final e f35337i;

    /* renamed from: j  reason: collision with root package name */
    private final f f35338j;

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f35330l = {v.c(FullscreenVideoFragment.class, "fallbackImg", "getFallbackImg()I", 0), v.c(FullscreenVideoFragment.class, "canSkip", "getCanSkip()Z", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final b f35329k = new Object();

    /* compiled from: FullscreenVideoFragment.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void E(FullscreenVideoFragment fullscreenVideoFragment);
    }

    /* compiled from: FullscreenVideoFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b {
    }

    /* compiled from: FullscreenVideoFragment.kt */
    /* loaded from: classes3.dex */
    public static final class c implements x.c {
        c() {
        }

        @Override // m6.x.c
        public final void K0(ExoPlaybackException error) {
            u.j(error, "error");
            FullscreenVideoFragment fullscreenVideoFragment = FullscreenVideoFragment.this;
            Job job = fullscreenVideoFragment.f35331c;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            FullscreenVideoFragment.t1(fullscreenVideoFragment);
        }

        @Override // m6.x.c
        public final void Z0(int i11, boolean z5) {
            MaterialButton materialButton = null;
            FullscreenVideoFragment fullscreenVideoFragment = FullscreenVideoFragment.this;
            if (i11 == 3) {
                Job job = fullscreenVideoFragment.f35331c;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                }
                fm.b bVar = fullscreenVideoFragment.f35334f;
                if (bVar != null) {
                    ProgressBar loader = (ProgressBar) bVar.f67700c;
                    u.i(loader, "loader");
                    loader.setVisibility(4);
                    ImageView preview = (ImageView) bVar.f67701d;
                    u.i(preview, "preview");
                    preview.setVisibility(4);
                    PlayerView video = (PlayerView) bVar.f67703f;
                    u.i(video, "video");
                    video.setVisibility(0);
                }
            } else if (i11 == 4) {
                fm.b bVar2 = fullscreenVideoFragment.f35334f;
                if (bVar2 != null) {
                    materialButton = (MaterialButton) bVar2.f67702e;
                }
                if (materialButton != null) {
                    materialButton.setVisibility(0);
                }
            }
        }
    }

    /* compiled from: FullscreenVideoFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.core.device.FullscreenVideoFragment$onViewCreated$4", f = "FullscreenVideoFragment.kt", l = {ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35340a;

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new d(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f35340a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                this.f35340a = 1;
                if (DelayKt.delay(3000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            FullscreenVideoFragment.t1(FullscreenVideoFragment.this);
            return y.f85009a;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes3.dex */
    public static final class e implements bn0.d<Fragment, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f35342a = nm0.h.b(new com.withings.core.device.g(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f35343b;

        public e(Fragment fragment) {
            this.f35343b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Fragment fragment, k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f35342a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes3.dex */
    public static final class f implements bn0.d<Fragment, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f35344a = nm0.h.b(new com.withings.core.device.h(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f35345b;

        public f(Fragment fragment) {
            this.f35345b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Fragment fragment, k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f35344a.getValue();
        }
    }

    /* compiled from: FullscreenVideoFragment.kt */
    /* loaded from: classes3.dex */
    static final class g extends w implements ym0.a<String> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            int i11;
            FullscreenVideoFragment fullscreenVideoFragment = FullscreenVideoFragment.this;
            Bundle arguments = fullscreenVideoFragment.getArguments();
            if (arguments == null || (i11 = arguments.getInt("titleResId", 0)) == 0) {
                return null;
            }
            return fullscreenVideoFragment.getString(i11);
        }
    }

    /* compiled from: FullscreenVideoFragment.kt */
    /* loaded from: classes3.dex */
    static final class h extends w implements ym0.a<Uri> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final Uri invoke() {
            int i11;
            FullscreenVideoFragment fullscreenVideoFragment = FullscreenVideoFragment.this;
            Bundle arguments = fullscreenVideoFragment.getArguments();
            if (arguments == null || (i11 = arguments.getInt("urlResId")) == 0) {
                return null;
            }
            String string = fullscreenVideoFragment.getString(i11);
            u.i(string, "getString(...)");
            return Uri.parse(string);
        }
    }

    public FullscreenVideoFragment() {
        super(C1987R.layout.fullscreen_instructions_video);
        this.f35335g = nm0.h.b(new h());
        this.f35336h = nm0.h.b(new g());
        this.f35337i = new e(this);
        this.f35338j = new f(this);
    }

    public static void s1(FullscreenVideoFragment this$0) {
        MaterialButton materialButton;
        u.j(this$0, "this$0");
        fm.b bVar = this$0.f35334f;
        if (bVar != null) {
            materialButton = (MaterialButton) bVar.f67702e;
        } else {
            materialButton = null;
        }
        if (materialButton != null) {
            materialButton.setVisibility(8);
        }
        z0 z0Var = this$0.f35333e;
        if (z0Var != null) {
            z0Var.N(0L);
            z0 z0Var2 = this$0.f35333e;
            if (z0Var2 != null) {
                z0Var2.n(true);
                return;
            } else {
                u.s("player");
                throw null;
            }
        }
        u.s("player");
        throw null;
    }

    public static final void t1(FullscreenVideoFragment fullscreenVideoFragment) {
        fm.b bVar = fullscreenVideoFragment.f35334f;
        if (bVar != null) {
            ImageView preview = (ImageView) bVar.f67701d;
            u.i(preview, "preview");
            cm.c.a(preview, 500L, false, new com.withings.core.device.e(bVar));
            ProgressBar loader = (ProgressBar) bVar.f67700c;
            u.i(loader, "loader");
            cm.c.a(loader, 100L, true, new com.withings.core.device.f(bVar));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        u.j(context, "context");
        super.onAttach(context);
        this.f35332d = (a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        u.j(menu, "menu");
        u.j(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(C1987R.menu.fullscreen_video, menu);
        menu.findItem(C1987R.id.skip).setVisible(((Boolean) this.f35338j.getValue(this, f35330l[1])).booleanValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        fm.b b10 = fm.b.b(inflater, viewGroup);
        this.f35334f = b10;
        return b10.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        z0 z0Var = this.f35333e;
        if (z0Var != null) {
            z0Var.release();
            this.f35334f = null;
            super.onDestroy();
            return;
        }
        u.s("player");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        Job job = this.f35331c;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.f35332d = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == C1987R.id.skip) {
            a aVar = this.f35332d;
            if (aVar != null) {
                aVar.E(this);
                return true;
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        z0 z0Var = this.f35333e;
        if (z0Var != null) {
            z0Var.N(0L);
            z0 z0Var2 = this.f35333e;
            if (z0Var2 != null) {
                z0Var2.n(false);
                super.onPause();
                return;
            }
            u.s("player");
            throw null;
        }
        u.s("player");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        z0 z0Var = this.f35333e;
        if (z0Var != null) {
            z0Var.N(0L);
            z0 z0Var2 = this.f35333e;
            if (z0Var2 != null) {
                z0Var2.n(true);
                return;
            } else {
                u.s("player");
                throw null;
            }
        }
        u.s("player");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PlayerView playerView;
        Job launch$default;
        MaterialButton materialButton;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, true, false, 29);
        fm.b bVar = this.f35334f;
        if (bVar != null) {
            MaterialButton restart = (MaterialButton) bVar.f67702e;
            u.i(restart, "restart");
            ay.b.m(restart, false, true, 23);
            bVar.f67699b.setText((String) this.f35336h.getValue());
            ((ImageView) bVar.f67701d).setImageResource(((Number) this.f35337i.getValue(this, f35330l[0])).intValue());
        }
        z0 a11 = new z0.a(requireContext()).a();
        this.f35333e = a11;
        fm.b bVar2 = this.f35334f;
        if (bVar2 != null) {
            playerView = (PlayerView) bVar2.f67703f;
        } else {
            playerView = null;
        }
        if (playerView != null) {
            playerView.setPlayer(a11);
        }
        Uri uri = (Uri) this.f35335g.getValue();
        if (uri != null) {
            z0 z0Var = this.f35333e;
            if (z0Var != null) {
                d.a aVar = new d.a();
                aVar.c("HealthMate-Android");
                y.b bVar3 = new y.b(aVar);
                o.a aVar2 = new o.a();
                aVar2.f(uri);
                z0Var.i(bVar3.f(aVar2.a()));
                z0 z0Var2 = this.f35333e;
                if (z0Var2 != null) {
                    z0Var2.b();
                } else {
                    u.s("player");
                    throw null;
                }
            } else {
                u.s("player");
                throw null;
            }
        }
        z0 z0Var3 = this.f35333e;
        if (z0Var3 != null) {
            z0Var3.O(new c());
            fm.b bVar4 = this.f35334f;
            if (bVar4 != null && (materialButton = (MaterialButton) bVar4.f67702e) != null) {
                materialButton.setOnClickListener(new androidx.media3.ui.h(this, 2));
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new d(null), 3, null);
            this.f35331c = launch$default;
            return;
        }
        u.s("player");
        throw null;
    }
}
