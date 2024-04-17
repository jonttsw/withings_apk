package com.withings.common.device.companion;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.withings.wiscale2.C1987R;
import ga.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: CompanionLinkActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/withings/common/device/companion/CompanionLinkExplanationFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "Content", "Explanation", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CompanionLinkExplanationFragment extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f35071c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f35072d;

    /* renamed from: e  reason: collision with root package name */
    private ym0.a<y> f35073e;

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f35070g = {v.c(CompanionLinkExplanationFragment.class, "binding", "getBinding()Lcom/withings/common/device/databinding/FragmentCompanionLinkExplanationBinding;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final a f35069f = new Object();

    /* compiled from: CompanionLinkActivity.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/withings/common/device/companion/CompanionLinkExplanationFragment$Content;", "Landroid/os/Parcelable;", "()V", "ImageRes", "ImageUrl", "Lottie", "Lcom/withings/common/device/companion/CompanionLinkExplanationFragment$Content$ImageRes;", "Lcom/withings/common/device/companion/CompanionLinkExplanationFragment$Content$ImageUrl;", "Lcom/withings/common/device/companion/CompanionLinkExplanationFragment$Content$Lottie;", "common-device_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class Content implements Parcelable {

        /* compiled from: CompanionLinkActivity.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/companion/CompanionLinkExplanationFragment$Content$ImageRes;", "Lcom/withings/common/device/companion/CompanionLinkExplanationFragment$Content;", "common-device_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class ImageRes extends Content {
            public static final Parcelable.Creator<ImageRes> CREATOR = new Object();

            /* renamed from: a  reason: collision with root package name */
            private final int f35074a;

            /* compiled from: CompanionLinkActivity.kt */
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<ImageRes> {
                @Override // android.os.Parcelable.Creator
                public final ImageRes createFromParcel(Parcel parcel) {
                    u.j(parcel, "parcel");
                    return new ImageRes(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final ImageRes[] newArray(int i11) {
                    return new ImageRes[i11];
                }
            }

            public ImageRes(int i11) {
                super(0);
                this.f35074a = i11;
            }

            public final int a() {
                return this.f35074a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel out, int i11) {
                u.j(out, "out");
                out.writeInt(this.f35074a);
            }
        }

        /* compiled from: CompanionLinkActivity.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/companion/CompanionLinkExplanationFragment$Content$ImageUrl;", "Lcom/withings/common/device/companion/CompanionLinkExplanationFragment$Content;", "common-device_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class ImageUrl extends Content {
            public static final Parcelable.Creator<ImageUrl> CREATOR = new Object();

            /* renamed from: a  reason: collision with root package name */
            private final String f35075a;

            /* compiled from: CompanionLinkActivity.kt */
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<ImageUrl> {
                @Override // android.os.Parcelable.Creator
                public final ImageUrl createFromParcel(Parcel parcel) {
                    u.j(parcel, "parcel");
                    return new ImageUrl(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ImageUrl[] newArray(int i11) {
                    return new ImageUrl[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageUrl(String imageUrl) {
                super(0);
                u.j(imageUrl, "imageUrl");
                this.f35075a = imageUrl;
            }

            public final String a() {
                return this.f35075a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel out, int i11) {
                u.j(out, "out");
                out.writeString(this.f35075a);
            }
        }

        /* compiled from: CompanionLinkActivity.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/companion/CompanionLinkExplanationFragment$Content$Lottie;", "Lcom/withings/common/device/companion/CompanionLinkExplanationFragment$Content;", "common-device_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class Lottie extends Content {
            public static final Parcelable.Creator<Lottie> CREATOR = new Object();

            /* renamed from: a  reason: collision with root package name */
            private final String f35076a;

            /* renamed from: b  reason: collision with root package name */
            private final String f35077b;

            /* compiled from: CompanionLinkActivity.kt */
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<Lottie> {
                @Override // android.os.Parcelable.Creator
                public final Lottie createFromParcel(Parcel parcel) {
                    u.j(parcel, "parcel");
                    return new Lottie(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Lottie[] newArray(int i11) {
                    return new Lottie[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Lottie(String lottieFolderPath, String lottieFileName) {
                super(0);
                u.j(lottieFolderPath, "lottieFolderPath");
                u.j(lottieFileName, "lottieFileName");
                this.f35076a = lottieFolderPath;
                this.f35077b = lottieFileName;
            }

            public final String a() {
                return this.f35077b;
            }

            public final String b() {
                return this.f35076a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel out, int i11) {
                u.j(out, "out");
                out.writeString(this.f35076a);
                out.writeString(this.f35077b);
            }
        }

        public /* synthetic */ Content(int i11) {
            this();
        }

        private Content() {
        }
    }

    /* compiled from: CompanionLinkActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/companion/CompanionLinkExplanationFragment$Explanation;", "Landroid/os/Parcelable;", "common-device_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Explanation implements Parcelable {
        public static final Parcelable.Creator<Explanation> CREATOR = new Object();

        /* renamed from: a  reason: collision with root package name */
        private final int f35078a;

        /* renamed from: b  reason: collision with root package name */
        private final int f35079b;

        /* renamed from: c  reason: collision with root package name */
        private final Content f35080c;

        /* renamed from: d  reason: collision with root package name */
        private final int f35081d;

        /* renamed from: e  reason: collision with root package name */
        private final Integer f35082e;

        /* compiled from: CompanionLinkActivity.kt */
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<Explanation> {
            @Override // android.os.Parcelable.Creator
            public final Explanation createFromParcel(Parcel parcel) {
                Integer valueOf;
                u.j(parcel, "parcel");
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                Content content = (Content) parcel.readParcelable(Explanation.class.getClassLoader());
                int readInt3 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                }
                return new Explanation(readInt, readInt2, content, readInt3, valueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final Explanation[] newArray(int i11) {
                return new Explanation[i11];
            }
        }

        public Explanation(int i11, int i12, Content content, int i13, Integer num) {
            this.f35078a = i11;
            this.f35079b = i12;
            this.f35080c = content;
            this.f35081d = i13;
            this.f35082e = num;
        }

        public final int a() {
            return this.f35081d;
        }

        public final Content b() {
            return this.f35080c;
        }

        public final int c() {
            return this.f35079b;
        }

        public final Integer d() {
            return this.f35082e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int e() {
            return this.f35078a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel out, int i11) {
            u.j(out, "out");
            out.writeInt(this.f35078a);
            out.writeInt(this.f35079b);
            out.writeParcelable(this.f35080c, i11);
            out.writeInt(this.f35081d);
            Integer num = this.f35082e;
            if (num == null) {
                out.writeInt(0);
            } else {
                og.y.b(out, 1, num);
            }
        }
    }

    /* compiled from: CompanionLinkActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static CompanionLinkExplanationFragment a(Explanation explanation) {
            CompanionLinkExplanationFragment companionLinkExplanationFragment = new CompanionLinkExplanationFragment();
            companionLinkExplanationFragment.setArguments(androidx.core.os.e.a(new nm0.j("Explanation", explanation)));
            return companionLinkExplanationFragment;
        }
    }

    /* compiled from: CompanionLinkActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<Explanation> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Explanation invoke() {
            Explanation explanation;
            Bundle arguments = CompanionLinkExplanationFragment.this.getArguments();
            if (arguments != null) {
                explanation = (Explanation) arguments.getParcelable("Explanation");
            } else {
                explanation = null;
            }
            u.g(explanation);
            return explanation;
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes3.dex */
    public static final class c extends w implements ym0.l<CompanionLinkExplanationFragment, cl.b> {
        @Override // ym0.l
        public final cl.b invoke(CompanionLinkExplanationFragment companionLinkExplanationFragment) {
            CompanionLinkExplanationFragment fragment = companionLinkExplanationFragment;
            u.j(fragment, "fragment");
            return cl.b.a(fragment.requireView());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public CompanionLinkExplanationFragment() {
        super(C1987R.layout.fragment_companion_link_explanation);
        this.f35071c = by.kirich1409.viewbindingdelegate.e.a(this, new w(1), u9.a.a());
        this.f35072d = nm0.h.b(new b());
    }

    public static void s1(CompanionLinkExplanationFragment this$0) {
        u.j(this$0, "this$0");
        ym0.a<y> aVar = this$0.f35073e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final cl.b t1() {
        return (cl.b) this.f35071c.getValue(this, f35070g[0]);
    }

    private final Explanation u1() {
        return (Explanation) this.f35072d.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i11;
        ImageView imageView;
        u.j(view, "view");
        t1().f22989c.setText(u1().e());
        t1().f22991e.setText(u1().c());
        t1().f22988b.setText(u1().a());
        t1().f22988b.setOnClickListener(new gi.e(this, 2));
        MaterialButton setupSecondaryAction = t1().f22990d;
        u.i(setupSecondaryAction, "setupSecondaryAction");
        if (u1().d() != null) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setupSecondaryAction.setVisibility(i11);
        t1().f22990d.setOnClickListener(new gi.f(this, 1));
        Integer d11 = u1().d();
        if (d11 != null) {
            t1().f22990d.setText(d11.intValue());
        }
        Content b10 = u1().b();
        View view2 = null;
        if (b10 instanceof Content.ImageRes) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(((Content.ImageRes) b10).a());
            imageView = imageView2;
        } else if (b10 instanceof Content.ImageUrl) {
            ImageView imageView3 = new ImageView(getContext());
            Object a11 = ((Content.ImageUrl) b10).a();
            w9.g a12 = w9.a.a(imageView3.getContext());
            f.a aVar = new f.a(imageView3.getContext());
            aVar.d(a11);
            aVar.q(imageView3);
            a12.d(aVar.b());
            imageView = imageView3;
        } else if (b10 instanceof Content.Lottie) {
            LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
            Content.Lottie lottie = (Content.Lottie) b10;
            lottieAnimationView.setImageAssetsFolder(lottie.b());
            lottieAnimationView.setAnimation(lottie.a());
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.m();
            imageView = lottieAnimationView;
        } else if (b10 == null) {
            imageView = null;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (imageView != null) {
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            view2 = imageView;
        }
        if (view2 != null) {
            t1().f22987a.addView(view2);
        }
    }

    public final void v1(ym0.a<y> aVar) {
        this.f35073e = aVar;
    }
}
