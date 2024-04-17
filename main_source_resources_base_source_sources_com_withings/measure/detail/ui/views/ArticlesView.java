package com.withings.measure.detail.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.view.SectionView;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
import ym0.l;
/* compiled from: ArticlesView.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/withings/measure/detail/ui/views/ArticlesView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlin/Function1;", "", "Lnm0/y;", "onArticleClickListener", "setOnArticleClickListener", "(Lym0/l;)V", "", "Lcom/withings/learnmore/adapter/LearnMoreEntryTranslations;", "learnMoreEntryTranslations", "setArticles", "(Ljava/util/List;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "measure-detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ArticlesView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    private final i f41813t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArticlesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public final void setArticles(List<LearnMoreEntryTranslations> list) {
        y yVar;
        if (list != null) {
            this.f41813t.submitList(list);
            setVisibility(0);
            yVar = y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            setVisibility(8);
        }
    }

    public final void setOnArticleClickListener(l<? super String, y> onArticleClickListener) {
        u.j(onArticleClickListener, "onArticleClickListener");
        this.f41813t.d(onArticleClickListener);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticlesView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        TextView textView;
        u.j(context, "context");
        i iVar = new i();
        this.f41813t = iVar;
        LayoutInflater.from(context).inflate(C1987R.layout.articles_view, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22405a);
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        CharSequence text = obtainStyledAttributes.getText(1);
        if (obtainStyledAttributes.hasValue(0) && (textView = (TextView) findViewById(C1987R.id.section_articles_description)) != null) {
            textView.setVisibility(0);
            textView.setText(obtainStyledAttributes.getText(0));
        }
        SectionView sectionView = (SectionView) findViewById(C1987R.id.section_articles_title);
        if (sectionView != null) {
            sectionView.setTitle(text);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(C1987R.id.recyclerview);
        if (recyclerView != null) {
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0));
            recyclerView.setAdapter(iVar);
            zq.b.a(recyclerView, C1987R.drawable.home_default_item_divider, 0);
        }
    }
}
