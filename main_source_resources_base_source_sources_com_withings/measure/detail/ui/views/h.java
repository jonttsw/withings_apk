package com.withings.measure.detail.ui.views;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import coil.size.Scale;
import com.google.android.material.card.MaterialCardView;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.learnmore.adapter.LearnMoreEntry;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreKt;
import com.withings.wiscale2.C1987R;
import ga.f;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: ArticlesView.kt */
/* loaded from: classes4.dex */
public final class h extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f41840a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f41841b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f41842c;

    /* compiled from: ArticlesView.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<MaterialCardView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final MaterialCardView invoke() {
            return (MaterialCardView) h.this.itemView.findViewById(C1987R.id.card);
        }
    }

    /* compiled from: ArticlesView.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.a<ImageView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) h.this.itemView.findViewById(C1987R.id.image);
        }
    }

    /* compiled from: ArticlesView.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.a<TextView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) h.this.itemView.findViewById(C1987R.id.title);
        }
    }

    public h(View view) {
        super(view);
        this.f41840a = nm0.h.b(new c());
        this.f41841b = nm0.h.b(new b());
        this.f41842c = nm0.h.b(new a());
    }

    public final void a(LearnMoreEntryTranslations learnMoreEntryTranslations, final l<? super String, y> lVar) {
        final LearnMoreEntry languageOrDefault = learnMoreEntryTranslations.languageOrDefault();
        ((TextView) this.f41840a.getValue()).setText(languageOrDefault.getLabel());
        ImageView imageView = (ImageView) this.f41841b.getValue();
        u.i(imageView, "<get-image>(...)");
        String imageUrl = languageOrDefault.getImageUrl();
        w9.g a11 = w9.a.a(imageView.getContext());
        f.a aVar = new f.a(imageView.getContext());
        aVar.d(imageUrl);
        aVar.q(imageView);
        aVar.n(Scale.f23221a);
        a11.d(aVar.b());
        ((MaterialCardView) this.f41842c.getValue()).setOnClickListener(new View.OnClickListener() { // from class: com.withings.measure.detail.ui.views.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LearnMoreEntry learnMoreEntry = languageOrDefault;
                u.j(learnMoreEntry, "$learnMoreEntry");
                h this$0 = this;
                u.j(this$0, "this$0");
                l lVar2 = l.this;
                if (lVar2 != null) {
                    lVar2.invoke(LearnMoreKt.getArticleId(learnMoreEntry));
                }
                Context context = this$0.itemView.getContext();
                HMWebActivity.a aVar2 = HMWebActivity.f35395c;
                Context context2 = this$0.itemView.getContext();
                u.i(context2, "getContext(...)");
                context.startActivity(HMWebActivity.a.a(aVar2, context2, null, learnMoreEntry.getLabel(), learnMoreEntry.getUrl(), 18));
            }
        });
    }
}
