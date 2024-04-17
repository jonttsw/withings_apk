package com.withings.zendesk.models;

import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import zendesk.support.Section;
/* compiled from: ZendeskLabelData.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/withings/zendesk/models/ZendeskLabelData;", "", Constants.ScionAnalytics.PARAM_LABEL, "Lcom/withings/zendesk/models/ZendeskLabel;", "sections", "", "Lzendesk/support/Section;", "(Lcom/withings/zendesk/models/ZendeskLabel;Ljava/util/List;)V", "getLabel", "()Lcom/withings/zendesk/models/ZendeskLabel;", "getSections", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "zendesk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ZendeskLabelData {
    public static final int $stable = 8;
    private final ZendeskLabel label;
    private final List<Section> sections;

    /* JADX WARN: Multi-variable type inference failed */
    public ZendeskLabelData(ZendeskLabel label, List<? extends Section> sections) {
        u.j(label, "label");
        u.j(sections, "sections");
        this.label = label;
        this.sections = sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZendeskLabelData copy$default(ZendeskLabelData zendeskLabelData, ZendeskLabel zendeskLabel, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            zendeskLabel = zendeskLabelData.label;
        }
        if ((i11 & 2) != 0) {
            list = zendeskLabelData.sections;
        }
        return zendeskLabelData.copy(zendeskLabel, list);
    }

    public final ZendeskLabel component1() {
        return this.label;
    }

    public final List<Section> component2() {
        return this.sections;
    }

    public final ZendeskLabelData copy(ZendeskLabel label, List<? extends Section> sections) {
        u.j(label, "label");
        u.j(sections, "sections");
        return new ZendeskLabelData(label, sections);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZendeskLabelData)) {
            return false;
        }
        ZendeskLabelData zendeskLabelData = (ZendeskLabelData) obj;
        if (u.e(this.label, zendeskLabelData.label) && u.e(this.sections, zendeskLabelData.sections)) {
            return true;
        }
        return false;
    }

    public final ZendeskLabel getLabel() {
        return this.label;
    }

    public final List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.sections.hashCode() + (this.label.hashCode() * 31);
    }

    public String toString() {
        ZendeskLabel zendeskLabel = this.label;
        List<Section> list = this.sections;
        return "ZendeskLabelData(label=" + zendeskLabel + ", sections=" + list + ")";
    }
}
