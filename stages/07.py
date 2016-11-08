import json
stage='07'
data={}
data['width']=10
data['height']=5
data['hints']={}
data['hints']['horizontal']=['2','1 1','1 1','2 1','1 1','1 1','3 1','1 1','3 1','2']
data['hints']['vertical']=['1 1','5 1 1','1 1 5','1 1','7']
data['answer']=[]
data['answer'].append([0,0,0,0,0,0,1,0,1,0])
data['answer'].append([1,1,1,1,1,0,1,0,1,0])
data['answer'].append([1,0,0,1,0,1,1,1,1,1])
data['answer'].append([0,1,0,0,0,0,0,0,0,1])
data['answer'].append([0,0,1,1,1,1,1,1,1,0])
data['tips']='tips/07.json'

json.dump(data,open('stages/'+stage+'.json','w'),sort_keys=True)
