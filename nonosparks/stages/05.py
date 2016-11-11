import json
stage='05'
data={}
data['width']=5
data['height']=5
data['name']='The rain is comming'
data['hints']={}
data['hints']['horizontal']=['1 1 1','2','2 2','2','3 1']
data['hints']['vertical']=['5','4','1 1','1','1 1 1']
data['answer']=[]
data['answer'].append([1,1,1,1,1])
data['answer'].append([0,1,1,1,1])
data['answer'].append([1,0,0,0,1])
data['answer'].append([0,0,1,0,0])
data['answer'].append([1,0,1,0,1])
data['tips']='tips/05.json'
json.dump(data,open(stage+'.json','w'),sort_keys=True)
