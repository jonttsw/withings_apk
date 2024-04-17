package com.withings.wiscale2.food.ui.graph;

import ah.g;
import android.content.Context;
import b50.b;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.graph.GraphView;
import com.withings.graph.decorator.Decorator;
import com.withings.graph.decorator.j;
import com.withings.graph.selection.SelectionMode;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.graphs.c;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.model.FoodDayData;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import jm.a;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import rs.a;
import rs.e;
import ts.b;
/* compiled from: FoodWeekGraphFactory.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 A2\u00020\u0001:\u0004BCADB\u0011\b\u0016\u0012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00010\u00100\u00100\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u000eJ\u001f\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u000eJ\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u0014\u0010,\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u00104R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00108\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;¨\u0006E"}, d2 = {"Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory;", "", "Lcom/withings/wiscale2/food/ui/graph/FoodDataHolder;", "dataHolder", "", "getMaxValue", "(Lcom/withings/wiscale2/food/ui/graph/FoodDataHolder;)I", "", "Lrs/e;", "datumList", "getMaxDatum", "(Ljava/util/List;)Lrs/e;", "Lnm0/y;", "initGraphView", "()V", "addGraphToGraphView", "Lrs/a;", "kotlin.jvm.PlatformType", "generateWeekDatum", "(Ljava/util/List;)Ljava/util/List;", "Lcom/withings/wiscale2/food/model/FoodDayData;", "foodDayData", "getBarColor", "(Lcom/withings/wiscale2/food/model/FoodDayData;)I", "", "isToday", "getResColor", "(Lcom/withings/wiscale2/food/model/FoodDayData;Z)I", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, RemoteMessageConst.Notification.COLOR, "getColor", "(Landroid/content/Context;I)I", "addGraphDecorators", "Lcom/withings/graph/GraphView;", "graphView", "", "y", "Lcom/withings/graph/decorator/j;", "getHorizontalDecoratorAt", "(Lcom/withings/graph/GraphView;F)Lcom/withings/graph/decorator/j;", "setPopup", "init", "Landroid/content/Context;", "mainGraphView", "Lcom/withings/graph/GraphView;", "Lcom/withings/views/graphs/GraphPopupView;", "graphPopup", "Lcom/withings/views/graphs/GraphPopupView;", "Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory$ClickOnDatumListener;", "clickOnDatumListener", "Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory$ClickOnDatumListener;", "Lcom/withings/wiscale2/food/ui/graph/FoodDataHolder;", "maxYValue", "I", "maxCaloriesBudget", "leftRightMargin", "F", "shouldShowLineDecorator", "Z", "shouldShowLabelDecorator", "Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory$Builder;", "builder", "<init>", "(Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory$Builder;)V", "Companion", "Builder", "ClickOnDatumListener", "FoodWeekPopup", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FoodWeekGraphFactory {
    private static final int BAR_WIDTH_DP = 6;
    private static final float COLOR_ALPHA = 1.0f;
    private static final int LABEL_BACKGROUND_WIDTH_DP = 32;
    private static final int LABEL_MARGIN_DP = 12;
    private static final int MAX_X_VALUE = 6;
    private static final float MAX_Y_VALUE_RATIO = 1.2f;
    private static final int MAX_Y_VALUE_ROUNDED_TO = 500;
    private static final int MIN_BAR_HEIGHT_DP = 6;
    private static final int POPUP_SUBTEXT_ICON_SIZE = 6;
    private static final boolean SHOULD_ENABLE_ZOOM = false;
    private ClickOnDatumListener clickOnDatumListener;
    private final Context context;
    private FoodDataHolder dataHolder;
    private GraphPopupView graphPopup;
    private float leftRightMargin;
    private final GraphView mainGraphView;
    private int maxCaloriesBudget;
    private int maxYValue;
    private boolean shouldShowLabelDecorator;
    private boolean shouldShowLineDecorator;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: FoodWeekGraphFactory.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010)\u001a\u00020$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(¨\u0006/"}, d2 = {"Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory$Builder;", "", "mainGraphView", "Lcom/withings/graph/GraphView;", "dataHolder", "Lcom/withings/wiscale2/food/ui/graph/FoodDataHolder;", "clickOnDatumListener", "Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory$ClickOnDatumListener;", "(Lcom/withings/graph/GraphView;Lcom/withings/wiscale2/food/ui/graph/FoodDataHolder;Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory$ClickOnDatumListener;)V", "getClickOnDatumListener", "()Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory$ClickOnDatumListener;", "getDataHolder", "()Lcom/withings/wiscale2/food/ui/graph/FoodDataHolder;", "graphPopup", "Lcom/withings/views/graphs/GraphPopupView;", "getGraphPopup", "()Lcom/withings/views/graphs/GraphPopupView;", "setGraphPopup", "(Lcom/withings/views/graphs/GraphPopupView;)V", "leftRightMargin", "", "getLeftRightMargin", "()F", "setLeftRightMargin", "(F)V", "getMainGraphView", "()Lcom/withings/graph/GraphView;", "setMainGraphView", "(Lcom/withings/graph/GraphView;)V", "maxCaloriesBudget", "", "getMaxCaloriesBudget", "()I", "setMaxCaloriesBudget", "(I)V", "shouldShowLabelDecorator", "", "getShouldShowLabelDecorator", "()Z", "setShouldShowLabelDecorator", "(Z)V", "shouldShowLineDecorator", "getShouldShowLineDecorator", "setShouldShowLineDecorator", "build", "Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory;", "setCaloriesBudget", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Builder {
        public static final int $stable = 8;
        private final ClickOnDatumListener clickOnDatumListener;
        private final FoodDataHolder dataHolder;
        private GraphPopupView graphPopup;
        private float leftRightMargin;
        private GraphView mainGraphView;
        private int maxCaloriesBudget;
        private boolean shouldShowLabelDecorator;
        private boolean shouldShowLineDecorator;

        public Builder(GraphView mainGraphView, FoodDataHolder dataHolder, ClickOnDatumListener clickOnDatumListener) {
            u.j(mainGraphView, "mainGraphView");
            u.j(dataHolder, "dataHolder");
            u.j(clickOnDatumListener, "clickOnDatumListener");
            this.mainGraphView = mainGraphView;
            this.dataHolder = dataHolder;
            this.clickOnDatumListener = clickOnDatumListener;
        }

        public final FoodWeekGraphFactory build() {
            return new FoodWeekGraphFactory(this);
        }

        public final ClickOnDatumListener getClickOnDatumListener() {
            return this.clickOnDatumListener;
        }

        public final FoodDataHolder getDataHolder() {
            return this.dataHolder;
        }

        public final GraphPopupView getGraphPopup() {
            return this.graphPopup;
        }

        public final float getLeftRightMargin() {
            return this.leftRightMargin;
        }

        public final GraphView getMainGraphView() {
            return this.mainGraphView;
        }

        public final int getMaxCaloriesBudget() {
            return this.maxCaloriesBudget;
        }

        public final boolean getShouldShowLabelDecorator() {
            return this.shouldShowLabelDecorator;
        }

        public final boolean getShouldShowLineDecorator() {
            return this.shouldShowLineDecorator;
        }

        public final Builder setCaloriesBudget(int i11) {
            this.maxCaloriesBudget = i11;
            return this;
        }

        /* renamed from: setGraphPopup  reason: collision with other method in class */
        public final void m39setGraphPopup(GraphPopupView graphPopupView) {
            this.graphPopup = graphPopupView;
        }

        /* renamed from: setLeftRightMargin  reason: collision with other method in class */
        public final void m40setLeftRightMargin(float f11) {
            this.leftRightMargin = f11;
        }

        public final void setMainGraphView(GraphView graphView) {
            u.j(graphView, "<set-?>");
            this.mainGraphView = graphView;
        }

        public final void setMaxCaloriesBudget(int i11) {
            this.maxCaloriesBudget = i11;
        }

        public final void setShouldShowLabelDecorator(boolean z5) {
            this.shouldShowLabelDecorator = z5;
        }

        public final void setShouldShowLineDecorator(boolean z5) {
            this.shouldShowLineDecorator = z5;
        }

        public final Builder shouldShowLabelDecorator(boolean z5) {
            this.shouldShowLabelDecorator = z5;
            return this;
        }

        public final Builder shouldShowLineDecorator(boolean z5) {
            this.shouldShowLineDecorator = z5;
            return this;
        }

        public final Builder setGraphPopup(GraphPopupView graphPopup) {
            u.j(graphPopup, "graphPopup");
            this.graphPopup = graphPopup;
            return this;
        }

        public final Builder setLeftRightMargin(float f11) {
            this.leftRightMargin = f11;
            return this;
        }
    }

    /* compiled from: FoodWeekGraphFactory.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory$ClickOnDatumListener;", "", "Lorg/joda/time/DateTime;", FoodDayFragment.ARG_DAY, "Lnm0/y;", "onDatumClickListener", "(Lorg/joda/time/DateTime;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public interface ClickOnDatumListener {
        void onDatumClickListener(DateTime dateTime);
    }

    /* compiled from: FoodWeekGraphFactory.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory$Companion;", "", "()V", "BAR_WIDTH_DP", "", "COLOR_ALPHA", "", "LABEL_BACKGROUND_WIDTH_DP", "LABEL_MARGIN_DP", "MAX_X_VALUE", "MAX_Y_VALUE_RATIO", "MAX_Y_VALUE_ROUNDED_TO", "MIN_BAR_HEIGHT_DP", "POPUP_SUBTEXT_ICON_SIZE", "SHOULD_ENABLE_ZOOM", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: FoodWeekGraphFactory.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory$FoodWeekPopup;", "Lcom/withings/views/graphs/c;", "Lrs/e;", "datum", "", "getPopupText", "(Lrs/e;)Ljava/lang/String;", "getPopupSubText", "getPopupTitleText", "Lcom/withings/views/graphs/GraphPopupView$a;", "getPopupSubTextIcon", "(Lrs/e;)Lcom/withings/views/graphs/GraphPopupView$a;", "<init>", "(Lcom/withings/wiscale2/food/ui/graph/FoodWeekGraphFactory;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public final class FoodWeekPopup extends c {
        public FoodWeekPopup() {
        }

        @Override // com.withings.views.graphs.c, com.withings.views.graphs.GraphPopupView.c
        public String getPopupSubText(e datum) {
            u.j(datum, "datum");
            Object obj = datum.f95625j;
            u.h(obj, "null cannot be cast to non-null type com.withings.wiscale2.food.model.FoodDayData");
            FoodDayData foodDayData = (FoodDayData) obj;
            if (foodDayData.getEatenCalories() > foodDayData.getTotalBudget()) {
                return FoodWeekGraphFactory.this.context.getString(C1987R.string._CALORIES_INTAKE_HIGH_);
            }
            return FoodWeekGraphFactory.this.context.getString(C1987R.string._CALORIES_LEFT_TO_EAT_, a.c(a.d.a(FoodWeekGraphFactory.this.context), 87, foodDayData.getTotalBudget() - foodDayData.getEatenCalories(), 0, 0, 60).toString());
        }

        @Override // com.withings.views.graphs.c, com.withings.views.graphs.GraphPopupView.c
        public GraphPopupView.a getPopupSubTextIcon(e datum) {
            DateTime dateTime;
            u.j(datum, "datum");
            Object obj = datum.f95625j;
            u.h(obj, "null cannot be cast to non-null type com.withings.wiscale2.food.model.FoodDayData");
            FoodDayData foodDayData = (FoodDayData) obj;
            DateTime date = foodDayData.getDailyMealAggregate().getDate();
            if (date != null) {
                dateTime = date.withTimeAtStartOfDay();
            } else {
                dateTime = null;
            }
            return new SubTextIconHolder(y70.a.a(C1987R.drawable.dot_10_dp, FoodWeekGraphFactory.this.context, FoodWeekGraphFactory.this.getResColor(foodDayData, u.e(dateTime, DateTime.now().withTimeAtStartOfDay()))), g.k(6, FoodWeekGraphFactory.this.context), g.k(6, FoodWeekGraphFactory.this.context));
        }

        @Override // com.withings.views.graphs.GraphPopupView.c
        public String getPopupText(e datum) {
            u.j(datum, "datum");
            String string = FoodWeekGraphFactory.this.context.getString(C1987R.string._EATEN_, a.c(a.d.a(FoodWeekGraphFactory.this.context), 87, Math.round(datum.f95617b), 0, 0, 60));
            u.i(string, "getString(...)");
            String lowerCase = string.toLowerCase(Locale.ROOT);
            u.i(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }

        @Override // com.withings.views.graphs.GraphPopupView.c
        public String getPopupTitleText(e datum) {
            u.j(datum, "datum");
            Object obj = datum.f95625j;
            u.h(obj, "null cannot be cast to non-null type com.withings.wiscale2.food.model.FoodDayData");
            DateTime date = ((FoodDayData) obj).getDailyMealAggregate().getDate();
            u.g(date);
            return b.i(FoodWeekGraphFactory.this.context, date);
        }
    }

    public FoodWeekGraphFactory(Builder builder) {
        u.j(builder, "builder");
        GraphView mainGraphView = builder.getMainGraphView();
        this.mainGraphView = mainGraphView;
        Context context = mainGraphView.getContext();
        u.i(context, "getContext(...)");
        this.context = context;
        this.graphPopup = builder.getGraphPopup();
        this.dataHolder = builder.getDataHolder();
        this.leftRightMargin = builder.getLeftRightMargin();
        this.clickOnDatumListener = builder.getClickOnDatumListener();
        this.maxCaloriesBudget = builder.getMaxCaloriesBudget();
        this.shouldShowLabelDecorator = builder.getShouldShowLabelDecorator();
        this.shouldShowLineDecorator = builder.getShouldShowLineDecorator();
    }

    private final void addGraphDecorators() {
        float f11 = 0.0f;
        while (f11 < this.maxYValue * MAX_Y_VALUE_RATIO) {
            if (f11 != 0.0f) {
                if (this.shouldShowLineDecorator) {
                    GraphView graphView = this.mainGraphView;
                    graphView.b(km.a.g(graphView, f11, false, 0, null, null, null, null, ConstantsWs.WS_STATUS_WRONGBATTERYLVL));
                }
                if (this.shouldShowLabelDecorator) {
                    GraphView graphView2 = this.mainGraphView;
                    graphView2.b(getHorizontalDecoratorAt(graphView2, f11));
                }
            }
            f11 += this.maxYValue / 2;
        }
    }

    private final void addGraphToGraphView() {
        GraphView graphView = this.mainGraphView;
        b.a aVar = new b.a();
        aVar.l(generateWeekDatum(this.dataHolder.getMainDatumList()));
        graphView.setMainGraph(aVar.o());
    }

    private final List<rs.a> generateWeekDatum(List<? extends e> list) {
        List<? extends e> list2 = list;
        ArrayList arrayList = new ArrayList(x.y(list2, 10));
        for (e eVar : list2) {
            a.C1589a c1589a = new a.C1589a(eVar.f95616a, eVar.f95617b);
            Object obj = eVar.f95625j;
            u.h(obj, "null cannot be cast to non-null type com.withings.wiscale2.food.model.FoodDayData");
            c1589a.t(getBarColor((FoodDayData) obj));
            c1589a.z();
            int i11 = 6;
            c1589a.v(6);
            if (eVar.f95617b == 0.0f) {
                i11 = 0;
            }
            c1589a.x(i11);
            c1589a.f95629d = true;
            c1589a.r(1);
            c1589a.y();
            c1589a.f95628c = eVar.f95625j;
            arrayList.add(new rs.a(c1589a));
        }
        return arrayList;
    }

    private final int getBarColor(FoodDayData foodDayData) {
        DateTime dateTime;
        DateTime date = foodDayData.getDailyMealAggregate().getDate();
        if (date != null) {
            dateTime = date.withTimeAtStartOfDay();
        } else {
            dateTime = null;
        }
        return getColor(this.context, getResColor(foodDayData, u.e(dateTime, DateTime.now().withTimeAtStartOfDay())));
    }

    private final int getColor(Context context, int i11) {
        return androidx.core.content.a.getColor(context, i11);
    }

    private final j getHorizontalDecoratorAt(GraphView graphView, float f11) {
        Context context = graphView.getContext();
        u.g(context);
        int w11 = ah.u.w(16842809, context, -65281);
        j.a aVar = new j.a(context);
        aVar.o(Decorator.DrawOrder.f39677a);
        aVar.Z(a.d.a(context).b(f11, 87));
        aVar.d0(f11);
        aVar.M(2);
        aVar.Q(12);
        aVar.U(12);
        aVar.V(12);
        aVar.K(ah.u.j(1.0f, w11));
        aVar.a0(wq.a.k(C1987R.style.detail1, context, 14));
        aVar.X(32);
        return aVar.L();
    }

    private final e getMaxDatum(List<? extends e> list) {
        Object obj;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                Object next = it.next();
                if (!it.hasNext()) {
                    obj = next;
                } else {
                    float f11 = ((e) next).f95617b;
                    do {
                        Object next2 = it.next();
                        float f12 = ((e) next2).f95617b;
                        if (Float.compare(f11, f12) < 0) {
                            next = next2;
                            f11 = f12;
                        }
                    } while (it.hasNext());
                    obj = next;
                }
            }
            e eVar = (e) obj;
            if (eVar == null) {
                return new e(new e.a(0.0f, 0.0f));
            }
            return eVar;
        }
        return new e(new e.a(0.0f, 0.0f));
    }

    private final int getMaxValue(FoodDataHolder foodDataHolder) {
        float f11 = 500;
        return Math.round((getMaxDatum(foodDataHolder.getMainDatumList()).f95617b + f11) / f11) * 500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getResColor(FoodDayData foodDayData, boolean z5) {
        Float calories = foodDayData.getDailyMealAggregate().getCalories();
        if (calories != null) {
            if (calories.floatValue() >= foodDayData.getTotalBudget()) {
                return C1987R.color.statusBad;
            }
            if (z5) {
                return C1987R.color.datavizMonochromaticNeutral1;
            }
            return C1987R.color.statusGood;
        }
        return C1987R.color.statusInfo;
    }

    private final void initGraphView() {
        GraphView graphView = this.mainGraphView;
        float f11 = this.leftRightMargin;
        graphView.E(-f11, 0.0f, 6 + f11, this.maxYValue * MAX_Y_VALUE_RATIO);
        GraphView graphView2 = this.mainGraphView;
        float f12 = this.leftRightMargin;
        graphView2.D(-f12, 0.0f, f12 + 6.0f, this.maxYValue * MAX_Y_VALUE_RATIO);
        this.mainGraphView.setZoomEnabled(false);
        this.mainGraphView.setSelectionMode(SelectionMode.f39998b);
    }

    private final void setPopup() {
        GraphPopupView graphPopupView = this.graphPopup;
        if (graphPopupView != null) {
            graphPopupView.setShouldAlignToTopOfGraphView(true);
            graphPopupView.setPopupContentProvider(new FoodWeekPopup());
            graphPopupView.setShouldShowSubText(true);
            this.mainGraphView.setScrubbingEnabled(true);
        }
        this.mainGraphView.setPopup(this.graphPopup);
    }

    public final void init() {
        this.maxYValue = getMaxValue(this.dataHolder);
        initGraphView();
        addGraphToGraphView();
        addGraphDecorators();
        if (this.graphPopup != null) {
            setPopup();
        }
    }
}
