package com.withings.healthplus.contentscreens.ui.model;

import android.net.Uri;
import com.withings.healthplus.congrats.ui.model.SuccessTaskInfo;
import com.withings.healthplus.contentscreens.ui.model.ContentScreenUi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import vt.a;
import ym0.l;
import ym0.q;
/* compiled from: ContentCallback.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\n\u0010\u000bR4\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback;", "", "Lkotlin/Function3;", "Lvt/a;", "Lcom/withings/healthplus/congrats/ui/model/SuccessTaskInfo;", "", "Lnm0/y;", "getOnTaskCompleted", "()Lym0/q;", "onTaskCompleted", "<init>", "()V", "ArticleCallback", "DiscoveryCallback", "MeasurementCallback", "RecipeCallback", "SurveyCallback", "WorkoutCallback", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$ArticleCallback;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$DiscoveryCallback;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$MeasurementCallback;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$RecipeCallback;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$SurveyCallback;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$WorkoutCallback;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class ContentCallback {
    public static final int $stable = 0;

    /* compiled from: ContentCallback.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012(\b\u0002\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u0007\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\n\u001a\u00020\u00002(\b\u0002\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R:\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$MeasurementCallback;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback;", "Lkotlin/Function3;", "Lvt/a;", "Lcom/withings/healthplus/congrats/ui/model/SuccessTaskInfo;", "", "Lnm0/y;", "component1", "()Lym0/q;", "onTaskCompleted", "copy", "(Lym0/q;)Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$MeasurementCallback;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lym0/q;", "getOnTaskCompleted", "<init>", "(Lym0/q;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class MeasurementCallback extends ContentCallback {
        public static final int $stable = 0;
        private final q<a, SuccessTaskInfo, Integer, y> onTaskCompleted;

        public MeasurementCallback() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MeasurementCallback copy$default(MeasurementCallback measurementCallback, q qVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                qVar = measurementCallback.onTaskCompleted;
            }
            return measurementCallback.copy(qVar);
        }

        public final q<a, SuccessTaskInfo, Integer, y> component1() {
            return this.onTaskCompleted;
        }

        public final MeasurementCallback copy(q<? super a, ? super SuccessTaskInfo, ? super Integer, y> qVar) {
            return new MeasurementCallback(qVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof MeasurementCallback) && u.e(this.onTaskCompleted, ((MeasurementCallback) obj).onTaskCompleted)) {
                return true;
            }
            return false;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentCallback
        public q<a, SuccessTaskInfo, Integer, y> getOnTaskCompleted() {
            return this.onTaskCompleted;
        }

        public int hashCode() {
            q<a, SuccessTaskInfo, Integer, y> qVar = this.onTaskCompleted;
            if (qVar == null) {
                return 0;
            }
            return qVar.hashCode();
        }

        public String toString() {
            q<a, SuccessTaskInfo, Integer, y> qVar = this.onTaskCompleted;
            return "MeasurementCallback(onTaskCompleted=" + qVar + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public MeasurementCallback(q<? super a, ? super SuccessTaskInfo, ? super Integer, y> qVar) {
            super(null);
            this.onTaskCompleted = qVar;
        }

        public /* synthetic */ MeasurementCallback(q qVar, int i11, m mVar) {
            this((i11 & 1) != 0 ? null : qVar);
        }
    }

    /* compiled from: ContentCallback.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012(\b\u0002\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u0007\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ:\u0010\n\u001a\u00020\u00002(\b\u0002\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R:\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$SurveyCallback;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback;", "Lkotlin/Function3;", "Lvt/a;", "Lcom/withings/healthplus/congrats/ui/model/SuccessTaskInfo;", "", "Lnm0/y;", "component1", "()Lym0/q;", "onTaskCompleted", "copy", "(Lym0/q;)Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$SurveyCallback;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lym0/q;", "getOnTaskCompleted", "<init>", "(Lym0/q;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class SurveyCallback extends ContentCallback {
        public static final int $stable = 0;
        private final q<a, SuccessTaskInfo, Integer, y> onTaskCompleted;

        public SurveyCallback() {
            this(null, 1, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SurveyCallback copy$default(SurveyCallback surveyCallback, q qVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                qVar = surveyCallback.onTaskCompleted;
            }
            return surveyCallback.copy(qVar);
        }

        public final q<a, SuccessTaskInfo, Integer, y> component1() {
            return this.onTaskCompleted;
        }

        public final SurveyCallback copy(q<? super a, ? super SuccessTaskInfo, ? super Integer, y> qVar) {
            return new SurveyCallback(qVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof SurveyCallback) && u.e(this.onTaskCompleted, ((SurveyCallback) obj).onTaskCompleted)) {
                return true;
            }
            return false;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentCallback
        public q<a, SuccessTaskInfo, Integer, y> getOnTaskCompleted() {
            return this.onTaskCompleted;
        }

        public int hashCode() {
            q<a, SuccessTaskInfo, Integer, y> qVar = this.onTaskCompleted;
            if (qVar == null) {
                return 0;
            }
            return qVar.hashCode();
        }

        public String toString() {
            q<a, SuccessTaskInfo, Integer, y> qVar = this.onTaskCompleted;
            return "SurveyCallback(onTaskCompleted=" + qVar + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SurveyCallback(q<? super a, ? super SuccessTaskInfo, ? super Integer, y> qVar) {
            super(null);
            this.onTaskCompleted = qVar;
        }

        public /* synthetic */ SurveyCallback(q qVar, int i11, m mVar) {
            this((i11 & 1) != 0 ? null : qVar);
        }
    }

    public /* synthetic */ ContentCallback(m mVar) {
        this();
    }

    public abstract q<a, SuccessTaskInfo, Integer, y> getOnTaskCompleted();

    private ContentCallback() {
    }

    /* compiled from: ContentCallback.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012(\b\u0002\u0010\u000e\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J0\u0010\u000b\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJP\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022(\b\u0002\u0010\u000e\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u0006R:\u0010\u000e\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\f¨\u0006!"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$DiscoveryCallback;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback;", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lnm0/y;", "component1", "()Lym0/l;", "Lkotlin/Function3;", "Lvt/a;", "Lcom/withings/healthplus/congrats/ui/model/SuccessTaskInfo;", "", "component2", "()Lym0/q;", "onLinkClick", "onTaskCompleted", "copy", "(Lym0/l;Lym0/q;)Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$DiscoveryCallback;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lym0/l;", "getOnLinkClick", "Lym0/q;", "getOnTaskCompleted", "<init>", "(Lym0/l;Lym0/q;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class DiscoveryCallback extends ContentCallback {
        public static final int $stable = 0;
        private final l<Uri, y> onLinkClick;
        private final q<a, SuccessTaskInfo, Integer, y> onTaskCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DiscoveryCallback(l<? super Uri, y> onLinkClick, q<? super a, ? super SuccessTaskInfo, ? super Integer, y> qVar) {
            super(null);
            u.j(onLinkClick, "onLinkClick");
            this.onLinkClick = onLinkClick;
            this.onTaskCompleted = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DiscoveryCallback copy$default(DiscoveryCallback discoveryCallback, l lVar, q qVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lVar = discoveryCallback.onLinkClick;
            }
            if ((i11 & 2) != 0) {
                qVar = discoveryCallback.onTaskCompleted;
            }
            return discoveryCallback.copy(lVar, qVar);
        }

        public final l<Uri, y> component1() {
            return this.onLinkClick;
        }

        public final q<a, SuccessTaskInfo, Integer, y> component2() {
            return this.onTaskCompleted;
        }

        public final DiscoveryCallback copy(l<? super Uri, y> onLinkClick, q<? super a, ? super SuccessTaskInfo, ? super Integer, y> qVar) {
            u.j(onLinkClick, "onLinkClick");
            return new DiscoveryCallback(onLinkClick, qVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscoveryCallback)) {
                return false;
            }
            DiscoveryCallback discoveryCallback = (DiscoveryCallback) obj;
            if (u.e(this.onLinkClick, discoveryCallback.onLinkClick) && u.e(this.onTaskCompleted, discoveryCallback.onTaskCompleted)) {
                return true;
            }
            return false;
        }

        public final l<Uri, y> getOnLinkClick() {
            return this.onLinkClick;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentCallback
        public q<a, SuccessTaskInfo, Integer, y> getOnTaskCompleted() {
            return this.onTaskCompleted;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.onLinkClick.hashCode() * 31;
            q<a, SuccessTaskInfo, Integer, y> qVar = this.onTaskCompleted;
            if (qVar == null) {
                hashCode = 0;
            } else {
                hashCode = qVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            l<Uri, y> lVar = this.onLinkClick;
            q<a, SuccessTaskInfo, Integer, y> qVar = this.onTaskCompleted;
            return "DiscoveryCallback(onLinkClick=" + lVar + ", onTaskCompleted=" + qVar + ")";
        }

        public /* synthetic */ DiscoveryCallback(l lVar, q qVar, int i11, m mVar) {
            this(lVar, (i11 & 2) != 0 ? null : qVar);
        }
    }

    /* compiled from: ContentCallback.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002\u0012(\b\u0002\u0010\u000f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0004\b \u0010!J\"\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJV\u0010\u0010\u001a\u00020\u00002\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00022(\b\u0002\u0010\u000f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR)\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007R:\u0010\u000f\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006\""}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$RecipeCallback;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback;", "Lkotlin/Function1;", "", "Lcom/withings/healthplus/contentscreens/ui/model/ContentScreenUi$RecipeScreenUi$RecipeNutritionalValueUi;", "Lnm0/y;", "component1", "()Lym0/l;", "Lkotlin/Function3;", "Lvt/a;", "Lcom/withings/healthplus/congrats/ui/model/SuccessTaskInfo;", "", "component2", "()Lym0/q;", "onShowMoreClicked", "onTaskCompleted", "copy", "(Lym0/l;Lym0/q;)Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$RecipeCallback;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lym0/l;", "getOnShowMoreClicked", "Lym0/q;", "getOnTaskCompleted", "<init>", "(Lym0/l;Lym0/q;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class RecipeCallback extends ContentCallback {
        public static final int $stable = 0;
        private final l<List<ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi>, y> onShowMoreClicked;
        private final q<a, SuccessTaskInfo, Integer, y> onTaskCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RecipeCallback(l<? super List<ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi>, y> onShowMoreClicked, q<? super a, ? super SuccessTaskInfo, ? super Integer, y> qVar) {
            super(null);
            u.j(onShowMoreClicked, "onShowMoreClicked");
            this.onShowMoreClicked = onShowMoreClicked;
            this.onTaskCompleted = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RecipeCallback copy$default(RecipeCallback recipeCallback, l lVar, q qVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lVar = recipeCallback.onShowMoreClicked;
            }
            if ((i11 & 2) != 0) {
                qVar = recipeCallback.onTaskCompleted;
            }
            return recipeCallback.copy(lVar, qVar);
        }

        public final l<List<ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi>, y> component1() {
            return this.onShowMoreClicked;
        }

        public final q<a, SuccessTaskInfo, Integer, y> component2() {
            return this.onTaskCompleted;
        }

        public final RecipeCallback copy(l<? super List<ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi>, y> onShowMoreClicked, q<? super a, ? super SuccessTaskInfo, ? super Integer, y> qVar) {
            u.j(onShowMoreClicked, "onShowMoreClicked");
            return new RecipeCallback(onShowMoreClicked, qVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecipeCallback)) {
                return false;
            }
            RecipeCallback recipeCallback = (RecipeCallback) obj;
            if (u.e(this.onShowMoreClicked, recipeCallback.onShowMoreClicked) && u.e(this.onTaskCompleted, recipeCallback.onTaskCompleted)) {
                return true;
            }
            return false;
        }

        public final l<List<ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi>, y> getOnShowMoreClicked() {
            return this.onShowMoreClicked;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentCallback
        public q<a, SuccessTaskInfo, Integer, y> getOnTaskCompleted() {
            return this.onTaskCompleted;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.onShowMoreClicked.hashCode() * 31;
            q<a, SuccessTaskInfo, Integer, y> qVar = this.onTaskCompleted;
            if (qVar == null) {
                hashCode = 0;
            } else {
                hashCode = qVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            l<List<ContentScreenUi.RecipeScreenUi.RecipeNutritionalValueUi>, y> lVar = this.onShowMoreClicked;
            q<a, SuccessTaskInfo, Integer, y> qVar = this.onTaskCompleted;
            return "RecipeCallback(onShowMoreClicked=" + lVar + ", onTaskCompleted=" + qVar + ")";
        }

        public /* synthetic */ RecipeCallback(l lVar, q qVar, int i11, m mVar) {
            this(lVar, (i11 & 2) != 0 ? null : qVar);
        }
    }

    /* compiled from: ContentCallback.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002\u0012(\b\u0002\u0010\u0011\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t¢\u0006\u0004\b\"\u0010#J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0006J0\u0010\r\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJf\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00022(\b\u0002\u0010\u0011\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u0006R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001f\u0010\u0006R:\u0010\u0011\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\u000e¨\u0006$"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$ArticleCallback;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback;", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lnm0/y;", "component1", "()Lym0/l;", "", "component2", "Lkotlin/Function3;", "Lvt/a;", "Lcom/withings/healthplus/congrats/ui/model/SuccessTaskInfo;", "", "component3", "()Lym0/q;", "onLinkClick", "onAuthorClicked", "onTaskCompleted", "copy", "(Lym0/l;Lym0/l;Lym0/q;)Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$ArticleCallback;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lym0/l;", "getOnLinkClick", "getOnAuthorClicked", "Lym0/q;", "getOnTaskCompleted", "<init>", "(Lym0/l;Lym0/l;Lym0/q;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class ArticleCallback extends ContentCallback {
        public static final int $stable = 0;
        private final l<String, y> onAuthorClicked;
        private final l<Uri, y> onLinkClick;
        private final q<a, SuccessTaskInfo, Integer, y> onTaskCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ArticleCallback(l<? super Uri, y> onLinkClick, l<? super String, y> onAuthorClicked, q<? super a, ? super SuccessTaskInfo, ? super Integer, y> qVar) {
            super(null);
            u.j(onLinkClick, "onLinkClick");
            u.j(onAuthorClicked, "onAuthorClicked");
            this.onLinkClick = onLinkClick;
            this.onAuthorClicked = onAuthorClicked;
            this.onTaskCompleted = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ArticleCallback copy$default(ArticleCallback articleCallback, l lVar, l lVar2, q qVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lVar = articleCallback.onLinkClick;
            }
            if ((i11 & 2) != 0) {
                lVar2 = articleCallback.onAuthorClicked;
            }
            if ((i11 & 4) != 0) {
                qVar = articleCallback.onTaskCompleted;
            }
            return articleCallback.copy(lVar, lVar2, qVar);
        }

        public final l<Uri, y> component1() {
            return this.onLinkClick;
        }

        public final l<String, y> component2() {
            return this.onAuthorClicked;
        }

        public final q<a, SuccessTaskInfo, Integer, y> component3() {
            return this.onTaskCompleted;
        }

        public final ArticleCallback copy(l<? super Uri, y> onLinkClick, l<? super String, y> onAuthorClicked, q<? super a, ? super SuccessTaskInfo, ? super Integer, y> qVar) {
            u.j(onLinkClick, "onLinkClick");
            u.j(onAuthorClicked, "onAuthorClicked");
            return new ArticleCallback(onLinkClick, onAuthorClicked, qVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArticleCallback)) {
                return false;
            }
            ArticleCallback articleCallback = (ArticleCallback) obj;
            if (u.e(this.onLinkClick, articleCallback.onLinkClick) && u.e(this.onAuthorClicked, articleCallback.onAuthorClicked) && u.e(this.onTaskCompleted, articleCallback.onTaskCompleted)) {
                return true;
            }
            return false;
        }

        public final l<String, y> getOnAuthorClicked() {
            return this.onAuthorClicked;
        }

        public final l<Uri, y> getOnLinkClick() {
            return this.onLinkClick;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentCallback
        public q<a, SuccessTaskInfo, Integer, y> getOnTaskCompleted() {
            return this.onTaskCompleted;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (this.onAuthorClicked.hashCode() + (this.onLinkClick.hashCode() * 31)) * 31;
            q<a, SuccessTaskInfo, Integer, y> qVar = this.onTaskCompleted;
            if (qVar == null) {
                hashCode = 0;
            } else {
                hashCode = qVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            l<Uri, y> lVar = this.onLinkClick;
            l<String, y> lVar2 = this.onAuthorClicked;
            q<a, SuccessTaskInfo, Integer, y> qVar = this.onTaskCompleted;
            return "ArticleCallback(onLinkClick=" + lVar + ", onAuthorClicked=" + lVar2 + ", onTaskCompleted=" + qVar + ")";
        }

        public /* synthetic */ ArticleCallback(l lVar, l lVar2, q qVar, int i11, m mVar) {
            this(lVar, lVar2, (i11 & 4) != 0 ? null : qVar);
        }
    }

    /* compiled from: ContentCallback.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012(\b\u0002\u0010\u0017\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r¢\u0006\u0004\b+\u0010,J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0006J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0006J\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u0011\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u008e\u0001\u0010\u0018\u001a\u00020\u00002\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2(\b\u0002\u0010\u0017\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010\u0006R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010#\u001a\u0004\b%\u0010\u0006R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b&\u0010\u0006R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010\fR:\u0010\u0017\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010\u0012¨\u0006-"}, d2 = {"Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$WorkoutCallback;", "Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback;", "Lkotlin/Function1;", "", "Lnm0/y;", "component1", "()Lym0/l;", "component2", "Lvk/a;", "component3", "Lkotlin/Function0;", "component4", "()Lym0/a;", "Lkotlin/Function3;", "Lvt/a;", "Lcom/withings/healthplus/congrats/ui/model/SuccessTaskInfo;", "", "component5", "()Lym0/q;", "onOpenPlayerClick", "onSuggestWatchClick", "modifyStateScreen", "onResumeLaterClicked", "onTaskCompleted", "copy", "(Lym0/l;Lym0/l;Lym0/l;Lym0/a;Lym0/q;)Lcom/withings/healthplus/contentscreens/ui/model/ContentCallback$WorkoutCallback;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lym0/l;", "getOnOpenPlayerClick", "getOnSuggestWatchClick", "getModifyStateScreen", "Lym0/a;", "getOnResumeLaterClicked", "Lym0/q;", "getOnTaskCompleted", "<init>", "(Lym0/l;Lym0/l;Lym0/l;Lym0/a;Lym0/q;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class WorkoutCallback extends ContentCallback {
        public static final int $stable = 0;
        private final l<vk.a, y> modifyStateScreen;
        private final l<String, y> onOpenPlayerClick;
        private final ym0.a<y> onResumeLaterClicked;
        private final l<String, y> onSuggestWatchClick;
        private final q<a, SuccessTaskInfo, Integer, y> onTaskCompleted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WorkoutCallback(l<? super String, y> onOpenPlayerClick, l<? super String, y> onSuggestWatchClick, l<? super vk.a, y> modifyStateScreen, ym0.a<y> aVar, q<? super a, ? super SuccessTaskInfo, ? super Integer, y> qVar) {
            super(null);
            u.j(onOpenPlayerClick, "onOpenPlayerClick");
            u.j(onSuggestWatchClick, "onSuggestWatchClick");
            u.j(modifyStateScreen, "modifyStateScreen");
            this.onOpenPlayerClick = onOpenPlayerClick;
            this.onSuggestWatchClick = onSuggestWatchClick;
            this.modifyStateScreen = modifyStateScreen;
            this.onResumeLaterClicked = aVar;
            this.onTaskCompleted = qVar;
        }

        public static /* synthetic */ WorkoutCallback copy$default(WorkoutCallback workoutCallback, l lVar, l lVar2, l lVar3, ym0.a aVar, q qVar, int i11, Object obj) {
            l<String, y> lVar4 = lVar;
            if ((i11 & 1) != 0) {
                lVar4 = workoutCallback.onOpenPlayerClick;
            }
            l<String, y> lVar5 = lVar2;
            if ((i11 & 2) != 0) {
                lVar5 = workoutCallback.onSuggestWatchClick;
            }
            l lVar6 = lVar5;
            l<vk.a, y> lVar7 = lVar3;
            if ((i11 & 4) != 0) {
                lVar7 = workoutCallback.modifyStateScreen;
            }
            l lVar8 = lVar7;
            ym0.a<y> aVar2 = aVar;
            if ((i11 & 8) != 0) {
                aVar2 = workoutCallback.onResumeLaterClicked;
            }
            ym0.a aVar3 = aVar2;
            q<a, SuccessTaskInfo, Integer, y> qVar2 = qVar;
            if ((i11 & 16) != 0) {
                qVar2 = workoutCallback.onTaskCompleted;
            }
            return workoutCallback.copy(lVar4, lVar6, lVar8, aVar3, qVar2);
        }

        public final l<String, y> component1() {
            return this.onOpenPlayerClick;
        }

        public final l<String, y> component2() {
            return this.onSuggestWatchClick;
        }

        public final l<vk.a, y> component3() {
            return this.modifyStateScreen;
        }

        public final ym0.a<y> component4() {
            return this.onResumeLaterClicked;
        }

        public final q<a, SuccessTaskInfo, Integer, y> component5() {
            return this.onTaskCompleted;
        }

        public final WorkoutCallback copy(l<? super String, y> onOpenPlayerClick, l<? super String, y> onSuggestWatchClick, l<? super vk.a, y> modifyStateScreen, ym0.a<y> aVar, q<? super a, ? super SuccessTaskInfo, ? super Integer, y> qVar) {
            u.j(onOpenPlayerClick, "onOpenPlayerClick");
            u.j(onSuggestWatchClick, "onSuggestWatchClick");
            u.j(modifyStateScreen, "modifyStateScreen");
            return new WorkoutCallback(onOpenPlayerClick, onSuggestWatchClick, modifyStateScreen, aVar, qVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WorkoutCallback)) {
                return false;
            }
            WorkoutCallback workoutCallback = (WorkoutCallback) obj;
            if (u.e(this.onOpenPlayerClick, workoutCallback.onOpenPlayerClick) && u.e(this.onSuggestWatchClick, workoutCallback.onSuggestWatchClick) && u.e(this.modifyStateScreen, workoutCallback.modifyStateScreen) && u.e(this.onResumeLaterClicked, workoutCallback.onResumeLaterClicked) && u.e(this.onTaskCompleted, workoutCallback.onTaskCompleted)) {
                return true;
            }
            return false;
        }

        public final l<vk.a, y> getModifyStateScreen() {
            return this.modifyStateScreen;
        }

        public final l<String, y> getOnOpenPlayerClick() {
            return this.onOpenPlayerClick;
        }

        public final ym0.a<y> getOnResumeLaterClicked() {
            return this.onResumeLaterClicked;
        }

        public final l<String, y> getOnSuggestWatchClick() {
            return this.onSuggestWatchClick;
        }

        @Override // com.withings.healthplus.contentscreens.ui.model.ContentCallback
        public q<a, SuccessTaskInfo, Integer, y> getOnTaskCompleted() {
            return this.onTaskCompleted;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (this.modifyStateScreen.hashCode() + ((this.onSuggestWatchClick.hashCode() + (this.onOpenPlayerClick.hashCode() * 31)) * 31)) * 31;
            ym0.a<y> aVar = this.onResumeLaterClicked;
            int i11 = 0;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            int i12 = (hashCode2 + hashCode) * 31;
            q<a, SuccessTaskInfo, Integer, y> qVar = this.onTaskCompleted;
            if (qVar != null) {
                i11 = qVar.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            l<String, y> lVar = this.onOpenPlayerClick;
            l<String, y> lVar2 = this.onSuggestWatchClick;
            l<vk.a, y> lVar3 = this.modifyStateScreen;
            ym0.a<y> aVar = this.onResumeLaterClicked;
            q<a, SuccessTaskInfo, Integer, y> qVar = this.onTaskCompleted;
            return "WorkoutCallback(onOpenPlayerClick=" + lVar + ", onSuggestWatchClick=" + lVar2 + ", modifyStateScreen=" + lVar3 + ", onResumeLaterClicked=" + aVar + ", onTaskCompleted=" + qVar + ")";
        }

        public /* synthetic */ WorkoutCallback(l lVar, l lVar2, l lVar3, ym0.a aVar, q qVar, int i11, m mVar) {
            this(lVar, lVar2, lVar3, (i11 & 8) != 0 ? null : aVar, (i11 & 16) != 0 ? null : qVar);
        }
    }
}
