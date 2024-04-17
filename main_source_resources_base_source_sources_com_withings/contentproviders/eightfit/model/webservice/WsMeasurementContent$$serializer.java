package com.withings.contentproviders.eightfit.model.webservice;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: WsMeasurementContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/contentproviders/eightfit/model/webservice/WsMeasurementContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsMeasurementContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/contentproviders/eightfit/model/webservice/WsMeasurementContent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/contentproviders/eightfit/model/webservice/WsMeasurementContent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "eightfit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsMeasurementContent$$serializer implements GeneratedSerializer<WsMeasurementContent> {
    public static final WsMeasurementContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsMeasurementContent$$serializer wsMeasurementContent$$serializer = new WsMeasurementContent$$serializer();
        INSTANCE = wsMeasurementContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.contentproviders.eightfit.model.webservice.WsMeasurementContent", wsMeasurementContent$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("titleWithDevice", false);
        pluginGeneratedSerialDescriptor.addElement("contextualized", false);
        pluginGeneratedSerialDescriptor.addElement("contextualizeDescriptionWithDevice", false);
        pluginGeneratedSerialDescriptor.addElement("titleForManual", false);
        pluginGeneratedSerialDescriptor.addElement("contextualizeDescriptionForManual", false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("measureType", false);
        pluginGeneratedSerialDescriptor.addElement("recommendedDevice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsMeasurementContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = WsMeasurementContent.access$get$childSerializers$cp();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(WsContextualized$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, access$get$childSerializers$cp[7], IntSerializer.INSTANCE, access$get$childSerializers$cp[9]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsMeasurementContent deserialize(Decoder decoder) {
        int i11;
        List list;
        List list2;
        String str;
        String str2;
        WsContextualized wsContextualized;
        int i12;
        String str3;
        String str4;
        String str5;
        String str6;
        char c11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] access$get$childSerializers$cp = WsMeasurementContent.access$get$childSerializers$cp();
        int i13 = 6;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 4);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 6);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 8);
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 9, access$get$childSerializers$cp[9], null);
            str3 = decodeStringElement;
            str6 = decodeStringElement4;
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            str2 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            i11 = decodeIntElement;
            str5 = decodeStringElement3;
            wsContextualized = (WsContextualized) beginStructure.decodeNullableSerializableElement(descriptor2, 2, WsContextualized$$serializer.INSTANCE, null);
            i12 = 1023;
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 7, access$get$childSerializers$cp[7], null);
            str4 = decodeStringElement2;
        } else {
            boolean z5 = true;
            int i14 = 0;
            List list3 = null;
            List list4 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            WsContextualized wsContextualized2 = null;
            int i15 = 0;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        i13 = 6;
                    case 0:
                        i15 |= 1;
                        str9 = beginStructure.decodeStringElement(descriptor2, 0);
                        i13 = 6;
                    case 1:
                        str10 = beginStructure.decodeStringElement(descriptor2, 1);
                        i15 |= 2;
                        i13 = 6;
                    case 2:
                        wsContextualized2 = (WsContextualized) beginStructure.decodeNullableSerializableElement(descriptor2, 2, WsContextualized$$serializer.INSTANCE, wsContextualized2);
                        i15 |= 4;
                        i13 = 6;
                    case 3:
                        str8 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str8);
                        i15 |= 8;
                        i13 = 6;
                    case 4:
                        c11 = 5;
                        str11 = beginStructure.decodeStringElement(descriptor2, 4);
                        i15 |= 16;
                        i13 = 6;
                    case 5:
                        c11 = 5;
                        str7 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str7);
                        i15 |= 32;
                        i13 = 6;
                    case 6:
                        str12 = beginStructure.decodeStringElement(descriptor2, i13);
                        i15 |= 64;
                    case 7:
                        list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 7, access$get$childSerializers$cp[7], list3);
                        i15 |= 128;
                    case 8:
                        i14 = beginStructure.decodeIntElement(descriptor2, 8);
                        i15 |= 256;
                    case 9:
                        list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 9, access$get$childSerializers$cp[9], list4);
                        i15 |= 512;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i14;
            list = list3;
            list2 = list4;
            str = str7;
            str2 = str8;
            wsContextualized = wsContextualized2;
            i12 = i15;
            str3 = str9;
            str4 = str10;
            str5 = str11;
            str6 = str12;
        }
        beginStructure.endStructure(descriptor2);
        return new WsMeasurementContent(i12, str3, str4, wsContextualized, str2, str5, str, str6, list, i11, list2, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsMeasurementContent value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsMeasurementContent.write$Self$eightfit_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
