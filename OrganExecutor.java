class OrganExecutor {

    public static void main(String[] organ) {

        Organ o1 = new Organ(1,"Heart","Muscular","Thoracic cavity",300,12,"Pump blood","Cardiac","Coronary arteries",true,"Circulatory","Healthy","Low","Donor A","Recipient X","Transplanted","N/A","USA",4.9,"No complications");
        Organ o2 = new Organ(2,"Liver","Glandular","Abdominal cavity",1500,25,"Detoxification","Hepatic","Hepatic artery",true,"Digestive","Healthy","Medium","Donor B","Recipient Y","Pending","N/A","India",4.8,"Monitor liver enzymes");
        Organ o3 = new Organ(3,"Kidney","Excretory","Abdominal cavity",150,12,"Filter blood","Renal","Renal artery",true,"Urinary","Healthy","Medium","Donor C","Recipient Z","Transplanted","N/A","UK",4.7,"No issues");
        Organ o4 = new Organ(4,"Lung","Respiratory","Thoracic cavity",1000,24,"Gas exchange","Pulmonary","Pulmonary artery",true,"Respiratory","Healthy","Low","Donor D","Recipient W","Transplanted","N/A","USA",4.6,"Minor recovery needed");
        Organ o5 = new Organ(5,"Pancreas","Glandular","Abdominal cavity",80,15,"Insulin production","Endocrine","Pancreatic artery",true,"Endocrine","Healthy","High","Donor E","Recipient V","Pending","N/A","India",4.5,"Monitor blood sugar");
        Organ o6 = new Organ(6,"Spleen","Lymphatic","Abdominal cavity",150,12,"Immune response","Lymphoid","Splenic artery",false,"Lymphatic","Healthy","Medium","Donor F","Recipient U","N/A","N/A","UK",4.4,"Routine monitoring");
        Organ o7 = new Organ(7,"Brain","Neural","Cranial cavity",1400,15,"Cognition","Neural","Carotid artery",true,"Nervous","Healthy","Low","Donor G","Recipient T","N/A","N/A","USA",4.9,"No complications");
        Organ o8 = new Organ(8,"Stomach","Digestive","Abdominal cavity",150,30,"Digestion","Muscular","Celiac artery",false,"Digestive","Healthy","Medium","Donor H","Recipient S","N/A","N/A","India",4.3,"Monitor digestion");
        Organ o9 = new Organ(9,"Intestine","Digestive","Abdominal cavity",200,400,"Absorption","Muscular","Mesenteric artery",false,"Digestive","Healthy","Medium","Donor I","Recipient R","N/A","N/A","UK",4.2,"Monitor nutrients");
        Organ o10 = new Organ(10,"Skin","Integumentary","Body surface",5000,200,"Protection, Sensation","Epithelial","Capillaries",false,"Integumentary","Healthy","Low","Donor J","Recipient Q","N/A","N/A","USA",4.5,"Check for rashes");

        o1.toDisplayDetails();
        o2.toDisplayDetails();
        o3.toDisplayDetails();
        o4.toDisplayDetails();
        o5.toDisplayDetails();
        o6.toDisplayDetails();
        o7.toDisplayDetails();
        o8.toDisplayDetails();
        o9.toDisplayDetails();
        o10.toDisplayDetails();
    }
}