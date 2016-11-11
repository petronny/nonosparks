import json
stage='09'
data={}
data['width']=5
data['height']=10
data['name']='Lemur'
data['hints']={}
data['hints']['horizontal']=['9','1 3','1 1 2 3','2 1 2','6']
data['hints']['vertical']=['2','1 1','1 2','1','1 1 1','1 3','2 1','5','5','1 1 1']
data['answer']=[]
data['answer'].append([0,1,1,0,0])
data['answer'].append([1,0,0,1,0])
data['answer'].append([1,0,1,1,0])
data['answer'].append([1,0,0,0,0])
data['answer'].append([1,0,1,0,1])
data['answer'].append([1,0,1,1,1])
data['answer'].append([1,1,0,0,1])
data['answer'].append([1,1,1,1,1])
data['answer'].append([1,1,1,1,1])
data['answer'].append([1,0,1,0,1])

json.dump(data,open(stage+'.json','w'),sort_keys=True)
