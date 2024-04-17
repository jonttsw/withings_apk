package com.withings.wiscale2.device.scale.ui;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.camera.camera2.internal.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.withings.device.details.scale.z;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.scale.ui.b;
import gi.i;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ScaleTutorialFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/device/scale/ui/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class b extends Fragment {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f54683k = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f54684c = -1;

    /* renamed from: d  reason: collision with root package name */
    private c f54685d;

    /* renamed from: e  reason: collision with root package name */
    private a f54686e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f54687f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f54688g;

    /* renamed from: h  reason: collision with root package name */
    private WorkflowBar f54689h;

    /* renamed from: i  reason: collision with root package name */
    private VideoView f54690i;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f54691j;

    /* compiled from: ScaleTutorialFragment.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void G1(b bVar, boolean z5);

        void T2(b bVar, int i11);

        void v1(b bVar, int i11);
    }

    /* compiled from: ScaleTutorialFragment.kt */
    /* renamed from: com.withings.wiscale2.device.scale.ui.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0722b {
        public static b a(c cVar) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putSerializable("TUTORIAL", cVar);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* compiled from: ScaleTutorialFragment.kt */
    /* loaded from: classes5.dex */
    public static final class c implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final int f54692a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f54693b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f54694c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f54695d;

        /* renamed from: e  reason: collision with root package name */
        private String f54696e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f54697f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f54698g;

        /* renamed from: h  reason: collision with root package name */
        private Integer f54699h;

        public c(int i11) {
            this.f54692a = i11;
        }

        public final Integer a() {
            return this.f54694c;
        }

        public final Integer b() {
            return this.f54695d;
        }

        public final int c() {
            return this.f54692a;
        }

        public final boolean d() {
            return this.f54697f;
        }

        public final Integer e() {
            return this.f54693b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.f54692a == ((c) obj).f54692a) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f54696e;
        }

        public final Integer g() {
            return this.f54698g;
        }

        public final Integer h() {
            return this.f54699h;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f54692a);
        }

        public final void i(Integer num) {
            this.f54694c = num;
        }

        public final void j(Integer num) {
            this.f54695d = num;
        }

        public final void k(boolean z5) {
            this.f54697f = z5;
        }

        public final void l(Integer num) {
            this.f54693b = num;
        }

        public final void m(String str) {
            this.f54696e = str;
        }

        public final void n() {
            this.f54698g = Integer.valueOf((int) C1987R.string._SKIP_);
        }

        public final void o(Integer num) {
            this.f54699h = num;
        }

        public final String toString() {
            return e.c(new StringBuilder("TutorialContent(pageId="), this.f54692a, ")");
        }
    }

    public static void s1(b this$0) {
        u.j(this$0, "this$0");
        a aVar = this$0.f54686e;
        if (aVar != null) {
            aVar.v1(this$0, this$0.f54684c);
        }
    }

    public static void t1(b this$0) {
        u.j(this$0, "this$0");
        a aVar = this$0.f54686e;
        if (aVar != null) {
            aVar.T2(this$0, this$0.f54684c);
        }
    }

    public static void u1(b this$0, MediaPlayer mediaPlayer) {
        u.j(this$0, "this$0");
        mediaPlayer.setLooping(true);
        VideoView videoView = this$0.f54690i;
        if (videoView != null) {
            videoView.start();
            VideoView videoView2 = this$0.f54690i;
            if (videoView2 != null) {
                videoView2.setBackgroundResource(0);
                ImageView imageView = this$0.f54691j;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    return;
                } else {
                    u.s("imageView");
                    throw null;
                }
            }
            u.s("videoView");
            throw null;
        }
        u.s("videoView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        u.j(context, "context");
        super.onAttach(context);
        if (getActivity() instanceof a) {
            FragmentActivity activity = getActivity();
            u.h(activity, "null cannot be cast to non-null type com.withings.wiscale2.device.scale.ui.ScaleTutorialFragment.Callback");
            this.f54686e = (a) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        View inflate = inflater.inflate(C1987R.layout.fragment_scale_tutorial, viewGroup, false);
        u.i(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        Bundle a11 = yq.b.a(this);
        if (Build.VERSION.SDK_INT >= 33) {
            obj = a11.getSerializable("TUTORIAL", c.class);
        } else {
            Serializable serializable = a11.getSerializable("TUTORIAL");
            if (!(serializable instanceof c)) {
                serializable = null;
            }
            obj = (c) serializable;
        }
        u.g(obj);
        c cVar = (c) obj;
        this.f54685d = cVar;
        this.f54684c = cVar.c();
        View findViewById = view.findViewById(C1987R.id.description);
        u.i(findViewById, "findViewById(...)");
        this.f54687f = (TextView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.title);
        u.i(findViewById2, "findViewById(...)");
        this.f54688g = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.workflowBar);
        u.i(findViewById3, "findViewById(...)");
        WorkflowBar workflowBar = (WorkflowBar) findViewById3;
        this.f54689h = workflowBar;
        int i11 = 0;
        ay.b.n(workflowBar, false, true, 23);
        View findViewById4 = view.findViewById(C1987R.id.video);
        u.i(findViewById4, "findViewById(...)");
        this.f54690i = (VideoView) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.image);
        u.i(findViewById5, "findViewById(...)");
        this.f54691j = (ImageView) findViewById5;
        WorkflowBar workflowBar2 = this.f54689h;
        if (workflowBar2 != null) {
            workflowBar2.setLeftClickListener(new i(this, 9));
            WorkflowBar workflowBar3 = this.f54689h;
            if (workflowBar3 != null) {
                workflowBar3.setRightClickListener(new z(this, 10));
                c cVar2 = this.f54685d;
                if (cVar2 != null) {
                    Integer e11 = cVar2.e();
                    if (e11 != null) {
                        int intValue = e11.intValue();
                        TextView textView = this.f54688g;
                        if (textView != null) {
                            textView.setText(intValue);
                        } else {
                            u.s("titleView");
                            throw null;
                        }
                    }
                    c cVar3 = this.f54685d;
                    if (cVar3 != null) {
                        Integer a12 = cVar3.a();
                        if (a12 != null) {
                            String string = requireContext().getString(a12.intValue());
                            u.i(string, "getString(...)");
                            TextView textView2 = this.f54687f;
                            if (textView2 != null) {
                                if (string.compareTo("&nbsp;") == 0) {
                                    string = "";
                                }
                                textView2.setText(string);
                            } else {
                                u.s("descriptionView");
                                throw null;
                            }
                        }
                        c cVar4 = this.f54685d;
                        if (cVar4 != null) {
                            Integer b10 = cVar4.b();
                            if (b10 != null) {
                                int intValue2 = b10.intValue();
                                ImageView imageView = this.f54691j;
                                if (imageView != null) {
                                    imageView.setImageResource(intValue2);
                                } else {
                                    u.s("imageView");
                                    throw null;
                                }
                            }
                            c cVar5 = this.f54685d;
                            if (cVar5 != null) {
                                Integer g11 = cVar5.g();
                                if (g11 != null) {
                                    int intValue3 = g11.intValue();
                                    WorkflowBar workflowBar4 = this.f54689h;
                                    if (workflowBar4 != null) {
                                        workflowBar4.setLeftText(intValue3);
                                    } else {
                                        u.s("workflowBar");
                                        throw null;
                                    }
                                }
                                c cVar6 = this.f54685d;
                                if (cVar6 != null) {
                                    Integer h11 = cVar6.h();
                                    if (h11 != null) {
                                        int intValue4 = h11.intValue();
                                        WorkflowBar workflowBar5 = this.f54689h;
                                        if (workflowBar5 != null) {
                                            workflowBar5.setRightText(intValue4);
                                        } else {
                                            u.s("workflowBar");
                                            throw null;
                                        }
                                    }
                                    a aVar = this.f54686e;
                                    if (aVar != null) {
                                        c cVar7 = this.f54685d;
                                        if (cVar7 != null) {
                                            aVar.G1(this, cVar7.d());
                                        } else {
                                            u.s("tutorialContent");
                                            throw null;
                                        }
                                    }
                                    VideoView videoView = this.f54690i;
                                    if (videoView != null) {
                                        c cVar8 = this.f54685d;
                                        if (cVar8 != null) {
                                            if (cVar8.f() == null) {
                                                i11 = 8;
                                            }
                                            videoView.setVisibility(i11);
                                            c cVar9 = this.f54685d;
                                            if (cVar9 != null) {
                                                if (cVar9.f() != null) {
                                                    VideoView videoView2 = this.f54690i;
                                                    if (videoView2 != null) {
                                                        videoView2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: pd0.a
                                                            @Override // android.media.MediaPlayer.OnPreparedListener
                                                            public final void onPrepared(MediaPlayer mediaPlayer) {
                                                                b.u1(b.this, mediaPlayer);
                                                            }
                                                        });
                                                        VideoView videoView3 = this.f54690i;
                                                        if (videoView3 != null) {
                                                            c cVar10 = this.f54685d;
                                                            if (cVar10 != null) {
                                                                videoView3.setVideoURI(Uri.parse(cVar10.f()));
                                                                return;
                                                            } else {
                                                                u.s("tutorialContent");
                                                                throw null;
                                                            }
                                                        }
                                                        u.s("videoView");
                                                        throw null;
                                                    }
                                                    u.s("videoView");
                                                    throw null;
                                                }
                                                return;
                                            }
                                            u.s("tutorialContent");
                                            throw null;
                                        }
                                        u.s("tutorialContent");
                                        throw null;
                                    }
                                    u.s("videoView");
                                    throw null;
                                }
                                u.s("tutorialContent");
                                throw null;
                            }
                            u.s("tutorialContent");
                            throw null;
                        }
                        u.s("tutorialContent");
                        throw null;
                    }
                    u.s("tutorialContent");
                    throw null;
                }
                u.s("tutorialContent");
                throw null;
            }
            u.s("workflowBar");
            throw null;
        }
        u.s("workflowBar");
        throw null;
    }
}
