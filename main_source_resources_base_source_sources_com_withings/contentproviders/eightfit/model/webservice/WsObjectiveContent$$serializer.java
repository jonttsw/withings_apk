package com.withings.contentproviders.eightfit.model.webservice;

import com.samsung.android.sdk.healthdata.HealthConstants;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: WsObjectiveContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/contentproviders/eightfit/model/webservice/WsObjectiveContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/contentproviders/eightfit/model/webservice/WsObjectiveContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/contentproviders/eightfit/model/webservice/WsObjectiveContent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/contentproviders/eightfit/model/webservice/WsObjectiveContent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "eightfit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsObjectiveContent$$serializer implements GeneratedSerializer<WsObjectiveContent> {
    public static final WsObjectiveContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        WsObjectiveContent$$serializer wsObjectiveContent$$serializer = new WsObjectiveContent$$serializer();
        INSTANCE = wsObjectiveContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.contentproviders.eightfit.model.webservice.WsObjectiveContent", wsObjectiveContent$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement(HealthConstants.FoodInfo.DESCRIPTION, false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("goal", false);
        pluginGeneratedSerialDescriptor.addElement("measureType", false);
        pluginGeneratedSerialDescriptor.addElement("contextualized", false);
        pluginGeneratedSerialDescriptor.addElement("contextualizedDescription", false);
        pluginGeneratedSerialDescriptor.addElement("recommendedDevices", false);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private WsObjectiveContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = WsObjectiveContent.access$get$childSerializers$cp();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, access$get$childSerializers$cp[3], DoubleSerializer.INSTANCE, IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(WsContextualized$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), access$get$childSerializers$cp[8], stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public WsObjectiveContent deserialize(Decoder decoder) {
        int i11;
        String str;
        List list;
        WsContextualized wsContextualized;
        List list2;
        int i12;
        String str2;
        String str3;
        String str4;
        String str5;
        double d11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] access$get$childSerializers$cp = WsObjectiveContent.access$get$childSerializers$cp();
        int i13 = 9;
        int i14 = 7;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 1);
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 2);
            double decodeDoubleElement = beginStructure.decodeDoubleElement(descriptor2, 4);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 5);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 8, access$get$childSerializers$cp[8], null);
            str2 = decodeStringElement;
            str5 = beginStructure.decodeStringElement(descriptor2, 9);
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, null);
            wsContextualized = (WsContextualized) beginStructure.decodeNullableSerializableElement(descriptor2, 6, WsContextualized$$serializer.INSTANCE, null);
            i11 = decodeIntElement;
            i12 = 1023;
            str4 = decodeStringElement3;
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 3, access$get$childSerializers$cp[3], null);
            str3 = decodeStringElement2;
            d11 = decodeDoubleElement;
        } else {
            boolean z5 = true;
            int i15 = 0;
            String str6 = null;
            List list3 = null;
            WsContextualized wsContextualized2 = null;
            String str7 = null;
            String str8 = null;
            double d12 = 0.0d;
            String str9 = null;
            String str10 = null;
            List list4 = null;
            int i16 = 0;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        i13 = 9;
                        i14 = 7;
                        break;
                    case 0:
                        i16 |= 1;
                        str9 = beginStructure.decodeStringElement(descriptor2, 0);
                        i13 = 9;
                        i14 = 7;
                        break;
                    case 1:
                        str10 = beginStructure.decodeStringElement(descriptor2, 1);
                        i16 |= 2;
                        i13 = 9;
                        i14 = 7;
                        break;
                    case 2:
                        str7 = beginStructure.decodeStringElement(descriptor2, 2);
                        i16 |= 4;
                        i13 = 9;
                        i14 = 7;
                        break;
                    case 3:
                        list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 3, access$get$childSerializers$cp[3], list4);
                        i16 |= 8;
                        i13 = 9;
                        i14 = 7;
                        break;
                    case 4:
                        d12 = beginStructure.decodeDoubleElement(descriptor2, 4);
                        i16 |= 16;
                        break;
                    case 5:
                        i15 = beginStructure.decodeIntElement(descriptor2, 5);
                        i16 |= 32;
                        break;
                    case 6:
                        wsContextualized2 = (WsContextualized) beginStructure.decodeNullableSerializableElement(descriptor2, 6, WsContextualized$$serializer.INSTANCE, wsContextualized2);
                        i16 |= 64;
                        break;
                    case 7:
                        str6 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, i14, StringSerializer.INSTANCE, str6);
                        i16 |= 128;
                        break;
                    case 8:
                        list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 8, access$get$childSerializers$cp[8], list3);
                        i16 |= 256;
                        break;
                    case 9:
                        str8 = beginStructure.decodeStringElement(descriptor2, i13);
                        i16 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i15;
            str = str6;
            list = list3;
            wsContextualized = wsContextualized2;
            list2 = list4;
            i12 = i16;
            str2 = str9;
            str3 = str10;
            str4 = str7;
            str5 = str8;
            d11 = d12;
        }
        beginStructure.endStructure(descriptor2);
        return new WsObjectiveContent(i12, str2, str3, str4, list2, d11, i11, wsContextualized, str, list, str5, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, WsObjectiveContent value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        WsObjectiveContent.write$Self$eightfit_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
