import json
stage='04'
data={}
data['width']=5
data['height']=5
data['hints']={}
data['hints']['horizontal']=['1','5','1 1','4','1 1']
data['hints']['vertical']=['1','5','1 1','4','1 1']
data['answer']=[]
data['answer'].append([0,1,0,0,0])
data['answer'].append([1,1,1,1,1])
data['answer'].append([0,1,0,1,0])
data['answer'].append([0,1,1,1,1])
data['answer'].append([0,1,0,1,0])
data['tips']='tips/04.json'
json.dump(data,open('stages/'+stage+'.json','w'),sort_keys=True)
